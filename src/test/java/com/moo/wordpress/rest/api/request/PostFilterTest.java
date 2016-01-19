package com.moo.wordpress.rest.api.request;

import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PostFilterTest {

    @Test
    public void testToMapReturnsValidMap() {
        PostFilter filter = new PostFilter();
        filter.setParam(PostFilter.WPFilterKeys.p, "A");
        filter.setParam(PostFilter.WPFilterKeys.day, "B");
        HashMap<String, String> expectedMap = new HashMap<String, String>();
        expectedMap.put("filter[p]", "A");
        expectedMap.put("filter[day]", "B");
        assertThat(filter.toMap().size(), is(expectedMap.size()));
        assertTrue(filter.toMap().containsKey("filter[p]"));
        assertThat(filter.toMap().get("filter[p]"), is("A"));
        assertTrue(filter.toMap().containsKey("filter[day]"));
        assertThat(filter.toMap().get("filter[day]"), is("B"));

    }

    @Test
    public void testToMapReturnsEmptyMapForEmptyFilter() {
        PostFilter filter = new PostFilter();
        assertThat(filter.toMap().size(), is(0));
    }



}