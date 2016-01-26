package com.moo.wordpress.rest.api.model;

import com.google.gson.JsonElement;

/**
 * EntityMeta DTO
 *
 * The EntityMeta DTO from the Wordpress Api (http://wp-api.org)
 * Fields and documentation can be found:
 * http://wp-api.org/#entities_entity-meta
 */
public class EntityMeta {

    private JsonElement links;

    public JsonElement getLinks() {
        return links;
    }

    public void setLinks(JsonElement links) {
        this.links = links;
    }
}
