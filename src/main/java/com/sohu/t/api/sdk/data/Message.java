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
 * Date: 13-1-7
 * Time: 下午3:14
 */
public class Message {
    private long id;
    private long sender_id;
    private String text;
    private long recipient_id;
    private String created_at;
    private String sender_screen_name;
    private String recipient_screen_name;
    private User sender;
    private User recipient;

    public Message(Response res) throws TBlogException {
        init(res.asJSONObject());
    }

    public Message(JSONObject jsonObject) throws TBlogException {
        init(jsonObject);
    }

    private void init(JSONObject jsonObject) throws TBlogException {
        try {
            this.sender_id = Long.valueOf(jsonObject.getString("sender_id"));
            this.text = jsonObject.getString("text");
            this.recipient_id = Long.valueOf(jsonObject.getString("recipient_id"));
            this.created_at = jsonObject.getString("created_at");
            this.sender_screen_name = jsonObject.getString("sender_screen_name");
            this.recipient_screen_name = jsonObject.getString("recipient_screen_name");
            this.sender = new User(jsonObject.getJSONObject("sender"));
            this.recipient = new User(jsonObject.getJSONObject("recipient"));
        } catch (JSONException je) {

        }
    }

    public static List<Message> constructMessages(Response res) throws TBlogException {
        JSONArray jsonArray = res.asJSONArray();
        List<Message> messageList = new ArrayList<Message>(jsonArray.length());
        try {
            for (int i = 0; i < jsonArray.length(); i++) {
                messageList.add(new Message(jsonArray.getJSONObject(i)));
            }
        } catch (JSONException je) {
        }
        return messageList;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSender_id() {
        return sender_id;
    }

    public void setSender_id(long sender_id) {
        this.sender_id = sender_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(long recipient_id) {
        this.recipient_id = recipient_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getSender_screen_name() {
        return sender_screen_name;
    }

    public void setSender_screen_name(String sender_screen_name) {
        this.sender_screen_name = sender_screen_name;
    }

    public String getRecipient_screen_name() {
        return recipient_screen_name;
    }

    public void setRecipient_screen_name(String recipient_screen_name) {
        this.recipient_screen_name = recipient_screen_name;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }
}
