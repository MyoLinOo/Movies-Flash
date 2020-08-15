package com.myogardener.moviesflash.api

import com.myogardener.moviesflash.model.Detail
import com.myogardener.moviesflash.model.Movies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MoviesApiInterface {

    @GET("top_rated")
    fun getTopRated(
        @Query("api_key") apiKey: String
    ): Call<Movies>


    @GET("{movie_id}")
    fun getMoviesDetail(
        @Path("movie_id") movie_id: Int,
        @Query("api_key") apiKey: String
    ): Call<Detail>
}

