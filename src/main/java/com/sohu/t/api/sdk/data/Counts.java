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
 * Date: 13-1-6
 * Time: 下午2:52
 */
public class Counts {
    private Long id = null;
    private int comments_count;
    private int transmit_count;


    public Counts(Response res) throws TBlogException {
        JSONObject json = res.asJSONObject();
        init(json);
    }

    public Counts(JSONObject json) throws TBlogException{
        init(json);
    }

    private void init(JSONObject json) throws TBlogException {
        try {
            this.comments_count = json.getInt("comments_count");
            this.transmit_count = json.getInt("transmit_count");
        } catch (JSONException je) {
            throw new TBlogException(je.getMessage() + ":" + json.toString(), je);
        }
    }

    public static List<Counts> constructStatuses(Response res) throws TBlogException {

        return constructStatuses(res.asJSONArray());
    }


    public static List<Counts> constructStatuses(JSONArray jsonArray) throws TBlogException {

        try {
            int size = jsonArray.length();
            List<Counts> countsList = new ArrayList<Counts>(size);
            for (int i = 0; i < size; i++) {
                countsList.add(new Counts(jsonArray.getJSONObject(i)));
            }
            return countsList;
        } catch (JSONException jsone) {
            throw new TBlogException(jsone);
        } catch (TBlogException te) {
            throw te;
        }
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getTransmit_count() {
        return transmit_count;
    }

    public void setTransmit_count(int transmit_count) {
        this.transmit_count = transmit_count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}

