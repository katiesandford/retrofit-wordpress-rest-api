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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class MediaTest {

    private JsonObject mediaDataObject;

    private DateFormat dateFormat;

    private Media media;

    @Before
    public void setUp() throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        URL url = getClass().getResource("Media.json");
        FileReader data = new FileReader(url.getPath());
        mediaDataObject = parser.parse(data).getAsJsonObject();
        String mediaDataString = mediaDataObject.toString();

        Gson gson = new GsonBuilder().setDateFormat(Api.DATE_FORMAT).create();

        dateFormat = new SimpleDateFormat(Api.DATE_FORMAT);

        media = gson.fromJson(mediaDataString, Media.class);
    }

    @Test
    public void testBasicMediaProperties() throws ParseException {
        assertThat(media.getId(), is(mediaDataObject.get("ID").getAsInt()));
        assertThat(media.getTitle(), is(mediaDataObject.get("title").getAsString()));
        assertThat(media.getStatus(), is(mediaDataObject.get("status").getAsString()));
        assertThat(media.getType(), is(mediaDataObject.get("type").getAsString()));
        assertThat(media.getContent(), is(mediaDataObject.get("content").getAsString()));
        assertThat(media.getLink(), is(mediaDataObject.get("link").getAsString()));

        Date date = dateFormat.parse(mediaDataObject.get("date").getAsString());
        assertThat(media.getDate(), is(date));

        Date dateModified = dateFormat.parse(mediaDataObject.get("modified").getAsString());
        assertThat(media.getModified(), is(dateModified));

        assertThat(media.getFormat(), is(mediaDataObject.get("format").getAsString()));
        assertThat(media.getSlug(), is(mediaDataObject.get("slug").getAsString()));
        assertThat(media.getGuid(), is(mediaDataObject.get("guid").getAsString()));
        assertThat(media.getExcerpt(), is(mediaDataObject.get("excerpt").getAsString()));
        assertThat(media.getMenuOrder(), is(mediaDataObject.get("menu_order").getAsInt()));
        assertThat(media.getCommentStatus(), is(mediaDataObject.get("comment_status").getAsString()));
        assertThat(media.getPingStatus(), is(mediaDataObject.get("ping_status").getAsString()));
        assertThat(media.isSticky(), is(mediaDataObject.get("sticky").getAsBoolean()));
        assertThat(media.getDateTZ(), is(mediaDataObject.get("date_tz").getAsString()));

        Date dateGMT = dateFormat.parse(mediaDataObject.get("date_gmt").getAsString());
        assertThat(media.getDateGMT(), is(dateGMT));

        assertThat(media.getModifiedTZ(), is(mediaDataObject.get("modified_tz").getAsString()));

        Date modifiedGMT = dateFormat.parse(mediaDataObject.get("modified_gmt").getAsString());
        assertThat(media.getModifiedGMT(), is(modifiedGMT));

        // Serialization of nested properties will be tested individually
        assertNotNull(media.getMeta());
        assertNotNull(media.getAuthor());
        assertNotNull(media.getAttachmentMeta());

        // Media specific properties (in addition to the post ones)
        assertThat(media.getSource(), is(mediaDataObject.get("source").getAsString()));
        assertThat(media.isImage(), is(mediaDataObject.get("is_image").getAsBoolean()));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetTermsThrowsUnsupportedOperationException()
    {
        media.getTerms();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetParentThrowsUnsupportedOperationException()
    {
        media.getParent();
    }

}