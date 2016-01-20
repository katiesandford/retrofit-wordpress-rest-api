package com.moo.wordpress.rest.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Image DTO
 *
 * The Image DTO from the Wordpress Api (http://wp-api.org)
 * Fields and documentation can be found:
 * http://wp-api.org/#entities_media-meta_sizes
 */
public class Image {

    private String file;

    private Integer width;

    private Integer height;

    @SerializedName("mime-type")
    private String mimeType;

    private String url;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

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

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
