package com.koreait.board3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BoardService {

    @GET("list")
    Call<List<BoardVO>> selBoardList();


}
