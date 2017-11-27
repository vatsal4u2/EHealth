
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Text implements Serializable
{

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("div")
    @Expose
    private String div;
    private final static long serialVersionUID = 2349814278222139362L;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

}
