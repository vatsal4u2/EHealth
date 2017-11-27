
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Assigner implements Serializable
{

    @SerializedName("display")
    @Expose
    private String display;
    private final static long serialVersionUID = 2986176803962217784L;

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

}
