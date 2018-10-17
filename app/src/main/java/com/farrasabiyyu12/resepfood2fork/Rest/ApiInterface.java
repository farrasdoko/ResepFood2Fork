package com.farrasabiyyu12.resepfood2fork.Rest;

import com.farrasabiyyu12.resepfood2fork.Main.model.ResponseRecipe;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("search")
    Call<ResponseRecipe> getResepData(
            @Query("key")
            String key,
            @Query("q")
            String q,
            @Query("page")
            int page
    );
}
