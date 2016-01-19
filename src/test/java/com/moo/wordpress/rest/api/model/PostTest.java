package com.moo.wordpress.rest.api.model;


import com.google.gson.*;
import com.moo.wordpress.rest.api.Api;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class PostTest {

    private JsonObject postDataObject;

    private DateFormat dateFormat;

    private Post post;

    @Before
    public void setUp() throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        URL url = getClass().getResource("Post.json");
        FileReader data = new FileReader(url.getPath());
        postDataObject = parser.parse(data).getAsJsonObject();
        String postDataString = postDataObject.toString();

        Gson gson = new GsonBuilder().setDateFormat(Api.DATE_FORMAT).create();

        dateFormat = new SimpleDateFormat(Api.DATE_FORMAT);

        post = gson.fromJson(postDataString, Post.class);
    }

    @Test
    public void testBasicPostProperties() throws ParseException {
        assertThat(post.getId(), is(postDataObject.get("ID").getAsInt()));
        assertThat(post.getTitle(), is(postDataObject.get("title").getAsString()));
        assertThat(post.getStatus(), is(postDataObject.get("status").getAsString()));
        assertThat(post.getType(), is(postDataObject.get("type").getAsString()));
        assertThat(post.getContent(), is(postDataObject.get("content").getAsString()));
        assertThat(post.getLink(), is(postDataObject.get("link").getAsString()));

        Date date = dateFormat.parse(postDataObject.get("date").getAsString());
        assertThat(post.getDate(), is(date));

        Date dateModified = dateFormat.parse(postDataObject.get("modified").getAsString());
        assertThat(post.getModified(), is(dateModified));

        assertThat(post.getFormat(), is(postDataObject.get("format").getAsString()));
        assertThat(post.getSlug(), is(postDataObject.get("slug").getAsString()));
        assertThat(post.getGuid(), is(postDataObject.get("guid").getAsString()));
        assertThat(post.getExcerpt(), is(postDataObject.get("excerpt").getAsString()));
        assertThat(post.getMenuOrder(), is(postDataObject.get("menu_order").getAsInt()));
        assertThat(post.getCommentStatus(), is(postDataObject.get("comment_status").getAsString()));
        assertThat(post.getPingStatus(), is(postDataObject.get("ping_status").getAsString()));
        assertThat(post.isSticky(), is(postDataObject.get("sticky").getAsBoolean()));
        assertThat(post.getDateTZ(), is(postDataObject.get("date_tz").getAsString()));

        Date dateGMT = dateFormat.parse(postDataObject.get("date_gmt").getAsString());
        assertThat(post.getDateGMT(), is(dateGMT));

        assertThat(post.getModifiedTZ(), is(postDataObject.get("modified_tz").getAsString()));

        Date modifiedGMT = dateFormat.parse(postDataObject.get("modified_gmt").getAsString());
        assertThat(post.getModifiedGMT(), is(modifiedGMT));

        // Serialization of nested properties will be tested individually
        assertNotNull(post.getMeta());
        assertNotNull(post.getFeaturedImage());
        assertNotNull(post.getAuthor());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetTermsThrowsUnsupportedOperationException()
    {
        post.getTerms();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetParentThrowsUnsupportedOperationException()
    {
        post.getParent();
    }
}
