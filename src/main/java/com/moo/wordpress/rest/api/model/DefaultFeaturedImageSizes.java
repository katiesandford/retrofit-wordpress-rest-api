package com.moo.wordpress.rest.api.model;

/**
 * When post thumbnails are enabled in wordpress 3 image sizes are generated from the uploaded featured image
 * See https://codex.wordpress.org/Post_Thumbnails
 * If further sizes are enabled, extend this class and add the options you require
 */
public class DefaultFeaturedImageSizes {

    private Image thumbnail;

    private Image medium;

    private Image large;

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Image getMedium() {
        return medium;
    }

    public void setMedium(Image medium) {
        this.medium = medium;
    }

    public Image getLarge() {
        return large;
    }

    public void setLarge(Image large) {
        this.large = large;
    }
}
