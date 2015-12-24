package com.develop.mauriciodinki.tvify.io.deserializer;

import com.develop.mauriciodinki.tvify.io.model.ShowsResponse;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by mauriciodinki on 23/12/15.
 */
public class ShowDeserializer implements JsonDeserializer<ShowsResponse> {
    @Override
    public ShowsResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gson = new Gson();
        return null;

    }
}
