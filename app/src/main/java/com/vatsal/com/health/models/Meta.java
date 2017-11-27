
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Meta implements Serializable
{

    @SerializedName("lastUpdated")
    @Expose
    private String lastUpdated;
    private final static long serialVersionUID = 1532536811799107034L;

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
