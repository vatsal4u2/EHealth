
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Period implements Serializable
{

    @SerializedName("start")
    @Expose
    private String start;
    private final static long serialVersionUID = 2223030178878099638L;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

}
