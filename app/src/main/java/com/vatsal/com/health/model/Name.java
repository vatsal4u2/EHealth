package com.vatsal.com.health.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vatsalpatel on 2017-11-24.
 */


public class Name {

    @SerializedName(value = "given")
    @Expose
    private String[] given;

    @SerializedName(value = "family")
    @Expose
    private String family;

    public String[] getGiven() {
        return given;
    }

    public void setGiven(String[] given) {
        this.given = given;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "given = " + given + ", family = " + family;
    }
}