package com.develop.mauriciodinki.tvify.io.model;
import com.develop.mauriciodinki.tvify.domain.Show;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauriciodinki on 23/12/15.
 */
public class ShowsResponse {

    ShowResults results;

    public ArrayList <Show> getShows(){
        return results.shows;
    }

    public class ShowResults {
        ArrayList <Show> shows;
    }
}
