package com.example.musa.movieapp.rest;

import com.example.musa.movieapp.moviemodel.MovieResponce;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by kalim on 11/19/2016.
 */

public interface ApiInterface {
    @GET("movie/top_rated")
    Call<MovieResponce> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MovieResponce> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
