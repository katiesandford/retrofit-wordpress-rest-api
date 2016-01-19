package com.moo.wordpress.rest.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * User DTO
 *
 * The User DTO from the Wordpress Api (http://wp-api.org)
 * Fields and documentation can be found:
 * http://wp-api.org/#entities_user
 */
public class User {

    @SerializedName("ID")
    private long id;

    private String name;

    private String slug;

    @SerializedName("URL")
    private String url;

    private String avatar;

    private EntityMeta meta;

    //TODO: example has some fields not in the api docs - username, first_name, last_name, nickname, description, registered

}
