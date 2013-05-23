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
public class Status extends TBlogResponse {

    public Integer transmit = null;
    public Integer comment = null;
    private String created_at = "";
    private String id = "";
    private String text = "";
    private String source = "";
    private boolean favorited = false;
    private String truncated = "";
    private String in_reply_to_status_id = "";
    private String in_reply_to_user_id = "";
    private String in_reply_to_screen_name = "";
    private String in_reply_to_status_text = "";
    private String small_pic = "";
    private String middle_pic = "";
    private String original_pic = "";
    private User user = null;
    private RetweetedStatus retweeted_status;
    private String coordinates = null;
    private Boolean in_reply_to_has_image = null;
    private List<PicGroupVO> pics = null;
    private Integer picsCount = null;

    public static List<Status> constructStatuses(Response res) throws TBlogException {

        return constructStatuses(res.asJSONArray());
    }


    public static List<Status> constructStatuses(JSONArray jsonArray) throws TBlogException {

        try {
            int size = jsonArray.length();
            List<Status> statuses = new ArrayList<Status>(size);
            for (int i = 0; i < size; i++) {
                statuses.add(new Status(jsonArray.getJSONObject(i)));
            }
            return statuses;
        } catch (JSONException jsone) {
            throw new TBlogException(jsone);
        } catch (TBlogException te) {
            throw te;
        }
    }

    public Status(Response res) throws TBlogException {
        JSONObject json = res.asJSONObject();
        init(json);

    }

    public Status(JSONObject json) throws TBlogException {
        init(json);
    }

    private void init(JSONObject json) throws TBlogException {

        try {
            this.created_at = json.getString(created_at);
            this.id = json.getString("id");
            this.text = json.getString("text");
            this.source = json.getString("source");
            this.favorited = json.getBoolean("favorited");
            this.truncated = json.getString("truncated");
            this.in_reply_to_status_id = json.getString("in_reply_to_status_id");
            this.in_reply_to_user_id = json.getString("in_reply_to_user_id");
            this.in_reply_to_screen_name = json.getString("in_reply_to_screen_name");
            this.in_reply_to_status_text = json.getString("in_reply_to_status_text");
            this.small_pic = json.getString("small_pic");
            this.middle_pic = json.getString("middle_pic");
            this.original_pic = json.getString("original_pic");
            this.user = new User(json.getJSONObject("user"));
            this.picsCount = json.getInt("picsCount");

            this.user = new User(json.getJSONObject("user"));


        } catch (JSONException je) {
            throw new TBlogException(je.getMessage() + ":" + json.toString(), je);
        }
    }


    public Integer getTransmit() {
        return transmit;
    }

    public void setTransmit(Integer transmit) {
        this.transmit = transmit;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
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

    public String getIn_reply_to_status_text() {
        return in_reply_to_status_text;
    }

    public void setIn_reply_to_status_text(String in_reply_to_status_text) {
        this.in_reply_to_status_text = in_reply_to_status_text;
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

    public RetweetedStatus getRetweeted_status() {
        return retweeted_status;
    }

    public void setRetweeted_status(RetweetedStatus retweeted_status) {
        this.retweeted_status = retweeted_status;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Boolean getIn_reply_to_has_image() {
        return in_reply_to_has_image;
    }

    public void setIn_reply_to_has_image(Boolean in_reply_to_has_image) {
        this.in_reply_to_has_image = in_reply_to_has_image;
    }

    public List<PicGroupVO> getPics() {
        return pics;
    }

    public void setPics(List<PicGroupVO> pics) {
        this.pics = pics;
    }

    public Integer getPicsCount() {
        return picsCount;
    }

    public void setPicsCount(Integer picsCount) {
        this.picsCount = picsCount;
    }
}
