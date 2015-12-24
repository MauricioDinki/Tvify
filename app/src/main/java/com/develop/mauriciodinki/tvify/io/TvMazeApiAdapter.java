package com.develop.mauriciodinki.tvify.io;


import android.widget.Adapter;

import retrofit.RestAdapter;

/**
 * Created by mauriciodinki on 23/12/15.
 */
public class TvMazeApiAdapter {

    private static TvMazeApiService API_SERVICE;

    public static TvMazeApiService getApiService(){
        if (API_SERVICE == null){
            RestAdapter adapter = new RestAdapter.Builder()
                    .setEndpoint("http://api.tvmaze.com")
                    .setLogLevel(RestAdapter.LogLevel.BASIC)
                    .build();
            API_SERVICE = adapter.create(TvMazeApiService.class);
        }

        return  API_SERVICE;
    }
}
