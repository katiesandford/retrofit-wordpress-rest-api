package com.moo.wordpress.rest.api.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/**
 * Media Meta DTO
 *
 * The Media DTO from the Wordpress Api (http://wp-api.org)
 * Fields and documentation can be found:
 * http://wp-api.org/#entities_media-meta
 */
public class MediaMeta {

    private Integer width;

    private Integer height;

    private String file;

    private DefaultFeaturedImageSizes sizes;

    @SerializedName("image_meta")
    private JsonElement imageMeta;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public DefaultFeaturedImageSizes getSizes() {
        return sizes;
    }

    public void setSizes(DefaultFeaturedImageSizes sizes) {
        this.sizes = sizes;
    }

    public JsonElement getImageMeta() {
        return imageMeta;
    }

    public void setImageMeta(JsonElement imageMeta) {
        this.imageMeta = imageMeta;
    }
}
