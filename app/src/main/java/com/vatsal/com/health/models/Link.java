
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Link implements Serializable
{

    @SerializedName("relation")
    @Expose
    private String relation;
    @SerializedName("url")
    @Expose
    private String url;
    private final static long serialVersionUID = -3215837362252422490L;

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
