package com.moo.wordpress.rest.api.model;

/**
 * Media DTO
 *
 * The Media DTO from the Wordpress Api (http://wp-api.org)
 * Fields and documentation can be found:
 * http://wp-api.org/#entities_media
 */
public class Media {

    private boolean isImage;

    private String source;

    public boolean isImage() {
        return isImage;
    }

    public void setImage(boolean isImage) {
        this.isImage = isImage;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
