
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Period_ implements Serializable
{

    @SerializedName("start")
    @Expose
    private String start;
    private final static long serialVersionUID = -4875070223597188514L;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

}
