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

public class MediaMetaTest {

    private JsonObject mediaMetaDataObject;

    private MediaMeta mediaMeta;

    @Before
    public void setUp() throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        URL url = getClass().getResource("MediaMeta.json");
        FileReader data = new FileReader(url.getPath());
        mediaMetaDataObject = parser.parse(data).getAsJsonObject();
        String mediaDataString = mediaMetaDataObject.toString();

        Gson gson = new GsonBuilder().setDateFormat(Api.DATE_FORMAT).create();

        mediaMeta = gson.fromJson(mediaDataString, MediaMeta.class);
    }

    @Test
    public void testBasicmediaMetaProperties() throws ParseException {
        assertThat(mediaMeta.getWidth(), is(mediaMetaDataObject.get("width").getAsInt()));
        assertThat(mediaMeta.getHeight(), is(mediaMetaDataObject.get("height").getAsInt()));
        assertThat(mediaMeta.getFile(), is(mediaMetaDataObject.get("file").getAsString()));
        assertThat(mediaMeta.getSizes(), is(mediaMetaDataObject.get("sizes")));
        assertThat(mediaMeta.getImageMeta(), is(mediaMetaDataObject.get("image_meta")));
    }


}