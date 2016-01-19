package com.moo.wordpress.rest.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Media DTO
 *
 * The Media DTO from the Wordpress Api (http://wp-api.org)
 * Fields and documentation can be found:
 * http://wp-api.org/#entities_media
 * This has all the properties of the Post object with the addition of source,
 * is_image and attachment meta, and the removal of featured_image
 */
public class Media {

    @SerializedName("ID")
    private Integer id;

    private String title;

    private Date date;

    @SerializedName("date_gmt")
    private Date dateGMT;

    private Date modified;

    @SerializedName("modified_gmt")
    private Date modifiedGMT;

    @SerializedName("date_tz")
    private String dateTZ;

    @SerializedName("modified_tz")
    private String modifiedTZ;

    private String status;

    private String type;

    private String name;

    private User author;

    private String content;

    private String excerpt;

    private String link;

    private String guid;

    @SerializedName("menu_order")
    private int menuOrder;

    @SerializedName("comment_status")
    private String commentStatus;

    @SerializedName("ping_status")
    private String pingStatus;

    private boolean sticky;

    private String format;

    private String slug;

    private EntityMeta meta;

    private String source;

    @SerializedName("is_image")
    private boolean isImage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateGMT() {
        return dateGMT;
    }

    public void setDateGMT(Date dateGMT) {
        this.dateGMT = dateGMT;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getModifiedGMT() {
        return modifiedGMT;
    }

    public void setModifiedGMT(Date modifiedGMT) {
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

    public void getParent() {
        throw new UnsupportedOperationException("API property is not yet implemented");
    }

    public void setParent(Integer parent) {
        throw new UnsupportedOperationException("API property is not yet implemented");
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void getTerms() {
        throw new UnsupportedOperationException("API property is not yet implemented");
    }

    public void setTerms(String terms) {
        throw new UnsupportedOperationException("API property is not yet implemented");
    }

    public EntityMeta getMeta() {
        return meta;
    }

    public void setMeta(EntityMeta meta) {
        this.meta = meta;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }


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

    public void getAttachmentMeta() {
        throw new UnsupportedOperationException("API property is not yet implemented");
    }

    public void setAttachmentMeta(String meta) {
        throw new UnsupportedOperationException("API property is not yet implemented");
    }
}
