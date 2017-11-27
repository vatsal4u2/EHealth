
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Search implements Serializable
{

    @SerializedName("mode")
    @Expose
    private String mode;
    private final static long serialVersionUID = -7267568350870950634L;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

}
