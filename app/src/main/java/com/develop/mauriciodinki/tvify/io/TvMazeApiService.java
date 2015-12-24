package com.develop.mauriciodinki.tvify.io;

import com.develop.mauriciodinki.tvify.io.model.ShowsResponse;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by mauriciodinki on 23/12/15.
 */
public interface TvMazeApiService {

    @GET("/shows")
    void getShows(Callback <ShowsResponse> serverResponse);
}
