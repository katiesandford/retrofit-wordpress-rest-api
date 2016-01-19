package com.moo.wordpress.rest.api.request;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * PostFilter represents a list of possible filters for the wp-api posts endpoint
 * See http://wp-api.org/#posts_retrieve-posts for more information
 */
public class PostFilter {

    private EnumMap<WPFilterKeys, String> enumMap = new EnumMap<WPFilterKeys, String>(WPFilterKeys.class);

    public enum WPFilterKeys {
        m,
        p,
        posts,
        w,
        cat,
        withcomments,
        withoutcomments,
        s,
        search,
        exact,
        sentence,
        calendar,
        page,
        paged,
        more,
        tb,
        pb,
        author,
        order,
        orderby,
        year,
        monthnum,
        day,
        hour,
        minute,
        second,
        category_name,
        tag,
        feed,
        author_name,
        //static,
        page_id,
        error,
        comments_popup,
        attachment,
        attachment_id,
        subpost,
        subpost_id,
        preview,
        robots,
        taxonomy,
        term,
        cpage,
        post_type,
        posts_per_page
    }

    public void setParam(WPFilterKeys key, String value) {
        this.enumMap.put(key, value);
    }

    public Map<String, String> toMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        for (EnumMap.Entry<WPFilterKeys, String> entry : this.enumMap.entrySet()) {
            String key = "filter[" + entry.getKey() + "]";
            map.put(key, entry.getValue());
        }
        return map;
    }
}
