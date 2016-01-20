package com.moo.wordpress.rest.api.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moo.wordpress.rest.api.Api;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.text.ParseException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ImageTest {

    private JsonObject imageDataObject;

    private Image image;

    @Before
    public void setUp() throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        URL url = getClass().getResource("Image.json");
        FileReader data = new FileReader(url.getPath());
        imageDataObject = parser.parse(data).getAsJsonObject();
        String mediaDataString = imageDataObject.toString();

        Gson gson = new GsonBuilder().setDateFormat(Api.DATE_FORMAT).create();

        image = gson.fromJson(mediaDataString, Image.class);
    }

    @Test
    public void testBasicmediaMetaProperties() throws ParseException {
        assertThat(image.getHeight(), is(imageDataObject.get("height").getAsInt()));
        assertThat(image.getWidth(), is(imageDataObject.get("width").getAsInt()));
        assertThat(image.getMimeType(), is(imageDataObject.get("mime-type").getAsString()));
        assertThat(image.getUrl(), is(imageDataObject.get("url").getAsString()));
    }

}