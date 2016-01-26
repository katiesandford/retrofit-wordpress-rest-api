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
        M,
        P,
        POSTS,
        W,
        CAT,
        WITHCOMMENTS,
        WITHOUTCOMMENTS,
        S,
        SEARCH,
        EXACT,
        SENTENCE,
        CALENDAR,
        PAGE,
        PAGED,
        MORE,
        TB,
        PB,
        AUTHOR,
        ORDER,
        ORDERBY,
        YEAR,
        MONTHNUM,
        DAY,
        HOUR,
        MINUTE,
        SECOND,
        CATEGORY_NAME,
        TAG,
        FEED,
        AUTHOR_NAME,
        STATIC,
        PAGE_ID,
        ERROR,
        COMMENTS_POPUP,
        ATTACHMENT,
        ATTACHMENT_ID,
        SUBPOST,
        SUBPOST_ID,
        PREVIEW,
        ROBOTS,
        TAXONOMY,
        TERM,
        CPAGE,
        POST_TYPE,
        POSTS_PER_PAGE;

        @Override
        public String toString() {
            // Required as the lower case "static" is reserved, so we must
            return super.toString().toLowerCase();
        }
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
