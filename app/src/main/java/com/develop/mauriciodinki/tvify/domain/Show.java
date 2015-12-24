package com.develop.mauriciodinki.tvify.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mauriciodinki on 23/12/15.
 */
public class Show {

    @SerializedName("name")
    String name;

    @SerializedName("language")
    String language;

    public Show(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {

        return language;
    }
}
