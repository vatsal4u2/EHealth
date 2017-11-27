
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Name implements Serializable
{

    @SerializedName("family")
    @Expose
    private String family;
    @SerializedName("given")
    @Expose
    private List<String> given = null;
    private final static long serialVersionUID = 1814246141680122651L;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public List<String> getGiven() {
        return given;
    }

    public void setGiven(List<String> given) {
        this.given = given;
    }

}
