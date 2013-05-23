package com.sohu.t.api.sdk.data;

import com.sohu.t.api.sdk.TBlogException;
import com.sohu.t.api.sdk.http.Response;
import com.sohu.t.api.sdk.json.JSONArray;
import com.sohu.t.api.sdk.json.JSONException;
import com.sohu.t.api.sdk.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * User: chenxiaojian
 * Date: 13-1-8
 * Time: 下午12:31
 */
public class Search {
    private String profile_image_url;
    private String created_at;
    private String from_user;
    private long to_user_id;
    private String text;
    private long id;
    private long from_user_id;
    private String geo;
    private String iso_language_code;
    private String source;


    public static List<Search> constructSearches(Response res) throws TBlogException {

        return constructSearches(res.asJSONArray());
    }


    public static List<Search> constructSearches(JSONArray jsonArray) throws TBlogException {
        try {
            int size = jsonArray.length();
            List<Search> searchUsers = new ArrayList<Search>(size);
            for (int i = 0; i < size; i++) {
                searchUsers.add(new Search(jsonArray.getJSONObject(i)));
            }
            return searchUsers;
        } catch (JSONException jsone) {
            throw new TBlogException(jsone);
        } catch (TBlogException te) {
            throw te;
        }
    }

    public Search(Response res) throws TBlogException {
        JSONObject json = res.asJSONObject();
        init(json);

    }

    public Search(JSONObject json) throws TBlogException {
        init(json);
    }

    private void init(JSONObject json) throws TBlogException {

        try {
            this.created_at = json.getString(created_at);
            this.id = Long.valueOf(json.getString("id"));
            this.text = json.getString("text");
            this.source = json.getString("source");


        } catch (JSONException je) {
            throw new TBlogException(je.getMessage() + ":" + json.toString(), je);
        }
    }


    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getFrom_user() {
        return from_user;
    }

    public void setFrom_user(String from_user) {
        this.from_user = from_user;
    }

    public long getTo_user_id() {
        return to_user_id;
    }

    public void setTo_user_id(long to_user_id) {
        this.to_user_id = to_user_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFrom_user_id() {
        return from_user_id;
    }

    public void setFrom_user_id(long from_user_id) {
        this.from_user_id = from_user_id;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getIso_language_code() {
        return iso_language_code;
    }

    public void setIso_language_code(String iso_language_code) {
        this.iso_language_code = iso_language_code;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
