package com.moo.wordpress.rest.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Post DTO
 *
 * The Post DTO from the Wordpress Api (http://wp-api.org)
 * Fields and documentation can be found:
 * http://wp-api.org/#entities_post
 */
public class Post {

    @SerializedName("ID")
    private long id;

    private String title;

    private String date;

    @SerializedName("date_gmt")
    private String dateGMT;

    private String modified;

    @SerializedName("modified_gmt")
    private String modifiedGMT;

    @SerializedName("date_tz")
    private String dateTZ;

    @SerializedName("modified_tz")
    private String modifiedTZ;

    private String status;

    private String type;

    private String name;

    private User author;

    private String password; //TODO: is this a field? In docs but not example

    private String content;

    private String excerpt;

    @SerializedName("content_raw")
    private String contentRaw; //TODO: is this a field? In docs but not example

    @SerializedName("excerpt_raw")
    private String excerptRaw; //TODO: is this a field? In docs but not example

    private long parent;

    private String link;

    private String guid;

    @SerializedName("menu_order")
    private int menuOrder;

    @SerializedName("comment_status")
    private String commentStatus;

    @SerializedName("ping_status")
    private String pingStatus;

    private boolean sticky;

    @SerializedName("featured_image")
    private Media featuredImage; //TODO: is this a field? In example but not docs

    private String format;// TODO: is this a field? In example it is format, but in docs it is post_format

    //private String terms; // TODO: what format is this?

    private EntityMeta meta; // TODO: what format is this?

    //private Entit post_meta; // TODO: what format is this?

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateGMT() {
        return dateGMT;
    }

    public void setDateGMT(String dateGMT) {
        this.dateGMT = dateGMT;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModifiedGMT() {
        return modifiedGMT;
    }

    public void setModifiedGMT(String modifiedGMT) {
        this.modifiedGMT = modifiedGMT;
    }

    public String getDateTZ() {
        return dateTZ;
    }

    public void setDateTZ(String dateTZ) {
        this.dateTZ = dateTZ;
    }

    public String getModifiedTZ() {
        return modifiedTZ;
    }

    public void setModifiedTZ(String modifiedTZ) {
        this.modifiedTZ = modifiedTZ;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getContentRaw() {
        return contentRaw;
    }

    public void setContentRaw(String contentRaw) {
        this.contentRaw = contentRaw;
    }

    public String getExcerptRaw() {
        return excerptRaw;
    }

    public void setExcerptRaw(String excerptRaw) {
        this.excerptRaw = excerptRaw;
    }

    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public int getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public boolean isSticky() {
        return sticky;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public Media getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(Media featuredImage) {
        this.featuredImage = featuredImage;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

//    public String getTerms() {
//        return terms;
//    }
//
//    public void setTerms(String terms) {
//        this.terms = terms;
//    }

    public EntityMeta getMeta() {
        return meta;
    }

    public void setMeta(EntityMeta meta) {
        this.meta = meta;
    }

//    public String getPost_meta() {
//        return post_meta;
//    }
//
//    public void setPost_meta(String post_meta) {
//        this.post_meta = post_meta;
//    }
}
