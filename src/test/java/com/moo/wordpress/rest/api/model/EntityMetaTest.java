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

public class EntityMetaTest {

    private JsonObject entityMetaDataObject;

    private EntityMeta entityMeta;

    @Before
    public void setUp() throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        URL url = getClass().getResource("EntityMeta.json");
        FileReader data = new FileReader(url.getPath());
        entityMetaDataObject = parser.parse(data).getAsJsonObject();
        String mediaDataString = entityMetaDataObject.toString();

        Gson gson = new GsonBuilder().setDateFormat(Api.DATE_FORMAT).create();

        entityMeta = gson.fromJson(mediaDataString, EntityMeta.class);
    }

    @Test
    public void testBasicmediaMetaProperties() throws ParseException {
        assertThat(entityMeta.getLinks().getAsJsonObject(), is(entityMetaDataObject.get("links").getAsJsonObject()));
    }

}
