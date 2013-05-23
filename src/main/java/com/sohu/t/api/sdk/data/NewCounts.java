package com.sohu.t.api.sdk.data;

import com.sohu.t.api.sdk.TBlogException;
import com.sohu.t.api.sdk.http.Response;
import com.sohu.t.api.sdk.json.JSONException;
import com.sohu.t.api.sdk.json.JSONObject;

import java.io.Serializable;

/**
 * User: chenxiaojian
 * Date: 13-1-6
 * Time: 下午5:02
 */
public class NewCounts implements Serializable {
    private int new_msg_count;
    private int new_at_count;
    private int new_comment_count;
    private int new_followers_count;
    private Integer new_twitter_count = null;

    public NewCounts(Response res) throws TBlogException {
        JSONObject json = res.asJSONObject();
        init(json);

    }

    public NewCounts(JSONObject json) throws TBlogException {
        init(json);
    }

    private void init(JSONObject json) throws TBlogException {
        try {
            this.new_msg_count = json.getInt("new_msg_count");
            this.new_at_count = json.getInt("new_at_count");
            this.new_comment_count = json.getInt("new_comment_count");
            this.new_followers_count = json.getInt("new_followers_count");
            this.new_twitter_count = json.getInt("new_twitter_count");
        } catch (JSONException je) {

        }
    }

    public int getNew_msg_count() {
        return new_msg_count;
    }

    public void setNew_msg_count(int new_msg_count) {
        this.new_msg_count = new_msg_count;
    }

    public int getNew_at_count() {
        return new_at_count;
    }

    public void setNew_at_count(int new_at_count) {
        this.new_at_count = new_at_count;
    }

    public int getNew_comment_count() {
        return new_comment_count;
    }

    public void setNew_comment_count(int new_comment_count) {
        this.new_comment_count = new_comment_count;
    }

    public int getNew_followers_count() {
        return new_followers_count;
    }

    public void setNew_followers_count(int new_followers_count) {
        this.new_followers_count = new_followers_count;
    }

    public Integer getNew_twitter_count() {
        return new_twitter_count;
    }

    public void setNew_twitter_count(Integer new_twitter_count) {
        this.new_twitter_count = new_twitter_count;
    }
}