package com.sohu.t.api.sdk.data;

import com.sohu.t.api.sdk.TBlogException;
import com.sohu.t.api.sdk.TBlogResponse;
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
public class User extends TBlogResponse {

    private String id = "";
    private String screen_name = "";
    private String name = "";
    private String location = "";
    private String description = "";
    private String url = "";
    private String gender = null;
    private String profile_image_url = "";
    private boolean p_rotected = false;
    private int followers_count = 0;
    private String profile_background_color = "";
    private String profile_text_color = "";
    private String profile_link_color = "";
    private String profile_sidebar_fill_color = "";
    private String profile_sidebar_border_color = "";
    private int friends_count = 0;
    private String created_at = "";
    private int favourites_count = 0;
    private String utc_offset = "";
    private String time_zone = "";
    private String profile_background_image_url = "";
    private String notifications = "";
    private boolean geo_enabled = false;
    private int statuses_count = 0;
    private boolean following = false;
    private boolean verified = false;
    private String lang = "zh_cn";
    private boolean contributors_enabled = false;
    private String passport = null;
    private String password = null;
    private RetweetedStatus status;

    public User(Response res) throws TBlogException {
        init(res.asJSONObject());
    }

    public User(JSONObject json) throws TBlogException {
        init(json);
    }

    public static List<User> constructUsers(JSONArray jsonArray) throws TBlogException {
        try {
            int size = jsonArray.length();
            List<User> users = new ArrayList<User>(size);
            for (int i = 0; i < size; i++) {
                users.add(new User(jsonArray.getJSONObject(i)));
            }
            return users;
        } catch (JSONException jsone) {
            throw new TBlogException(jsone);
        } catch (TBlogException te) {
            throw te;
        }

    }

    private void init(JSONObject json) throws TBlogException {

        try {
            this.id = json.getString("id");
            this.screen_name = json.getString("screen_name");
            this.name = json.getString("name");
            this.location = json.getString("location");
            this.description = json.getString("description");
            this.url = json.getString("url");
            this.gender = json.getString("gender");
            this.profile_image_url = json.getString("profile_image_url");
            this.p_rotected = json.getBoolean("protected");
            this.followers_count = json.getInt("followers_count");
            this.profile_background_color = json.getString("profile_background_color");
            this.profile_text_color = json.getString("profile_text_color");
            this.profile_link_color = json.getString("profile_link_color");
            this.profile_sidebar_fill_color = json.getString("profile_sidebar_fill_color");
            this.friends_count = json.getInt("friends_count");
            this.created_at = json.getString("created_at");
            this.favourites_count = json.getInt("favourites_count");
            this.utc_offset = json.getString("utc_offset");
            this.time_zone = json.getString("time_zone");
            this.profile_background_image_url = json.getString("profile_background_image_url");
            this.geo_enabled = json.getBoolean("geo_enabled");
            this.statuses_count = json.getInt("statuses_count");
            this.following = json.getBoolean("following");
            this.verified = json.getBoolean("verified");
            this.lang = json.optString("verified", this.lang);
            this.contributors_enabled = json.getBoolean("contributors_enabled");

        } catch (JSONException je) {
            throw new TBlogException(je.getMessage() + ":" + json.toString(), je);
        }
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public boolean isP_rotected() {
        return p_rotected;
    }

    public void setP_rotected(boolean p_rotected) {
        this.p_rotected = p_rotected;
    }

    public int getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(int followers_count) {
        this.followers_count = followers_count;
    }

    public String getProfile_background_color() {
        return profile_background_color;
    }

    public void setProfile_background_color(String profile_background_color) {
        this.profile_background_color = profile_background_color;
    }

    public String getProfile_text_color() {
        return profile_text_color;
    }

    public void setProfile_text_color(String profile_text_color) {
        this.profile_text_color = profile_text_color;
    }

    public String getProfile_link_color() {
        return profile_link_color;
    }

    public void setProfile_link_color(String profile_link_color) {
        this.profile_link_color = profile_link_color;
    }

    public String getProfile_sidebar_fill_color() {
        return profile_sidebar_fill_color;
    }

    public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
        this.profile_sidebar_fill_color = profile_sidebar_fill_color;
    }

    public String getProfile_sidebar_border_color() {
        return profile_sidebar_border_color;
    }

    public void setProfile_sidebar_border_color(String profile_sidebar_border_color) {
        this.profile_sidebar_border_color = profile_sidebar_border_color;
    }

    public int getFriends_count() {
        return friends_count;
    }

    public void setFriends_count(int friends_count) {
        this.friends_count = friends_count;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getFavourites_count() {
        return favourites_count;
    }

    public void setFavourites_count(int favourites_count) {
        this.favourites_count = favourites_count;
    }

    public String getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(String utc_offset) {
        this.utc_offset = utc_offset;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public String getProfile_background_image_url() {
        return profile_background_image_url;
    }

    public void setProfile_background_image_url(String profile_background_image_url) {
        this.profile_background_image_url = profile_background_image_url;
    }

    public String getNotifications() {
        return notifications;
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }

    public boolean isGeo_enabled() {
        return geo_enabled;
    }

    public void setGeo_enabled(boolean geo_enabled) {
        this.geo_enabled = geo_enabled;
    }

    public int getStatuses_count() {
        return statuses_count;
    }

    public void setStatuses_count(int statuses_count) {
        this.statuses_count = statuses_count;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public boolean isContributors_enabled() {
        return contributors_enabled;
    }

    public void setContributors_enabled(boolean contributors_enabled) {
        this.contributors_enabled = contributors_enabled;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RetweetedStatus getStatus() {
        return status;
    }

    public void setStatus(RetweetedStatus status) {
        this.status = status;
    }
}
