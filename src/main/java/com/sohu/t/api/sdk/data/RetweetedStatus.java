package com.sohu.t.api.sdk.data;

import com.sohu.t.api.sdk.TBlogException;
import com.sohu.t.api.sdk.json.JSONObject;

/**
 * User: chenxiaojian
 * Date: 13-1-5
 * Time: 上午10:26
 */
public class RetweetedStatus {
    private String created_at = "";
    private String id = "";
    private String text = "";
    private String source = "";
    private boolean favorited = false;
    private String truncated = "";
    private String in_reply_to_status_id = "";
    private String in_reply_to_user_id = "";
    private String in_reply_to_screen_name = "";
    private String small_pic = "";
    private String middle_pic = "";
    private String original_pic = "";
    private User user = null;


    public RetweetedStatus(JSONObject json) throws TBlogException {
        init(json);
    }


    private void init(JSONObject json) throws TBlogException {


    }


    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public String getTruncated() {
        return truncated;
    }

    public void setTruncated(String truncated) {
        this.truncated = truncated;
    }

    public String getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    public void setIn_reply_to_status_id(String in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    public String getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    public void setIn_reply_to_user_id(String in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    public String getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    public String getSmall_pic() {
        return small_pic;
    }

    public void setSmall_pic(String small_pic) {
        this.small_pic = small_pic;
    }

    public String getMiddle_pic() {
        return middle_pic;
    }

    public void setMiddle_pic(String middle_pic) {
        this.middle_pic = middle_pic;
    }

    public String getOriginal_pic() {
        return original_pic;
    }

    public void setOriginal_pic(String original_pic) {
        this.original_pic = original_pic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
