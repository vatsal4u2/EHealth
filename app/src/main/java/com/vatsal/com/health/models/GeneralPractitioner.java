
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GeneralPractitioner implements Serializable
{

    @SerializedName("reference")
    @Expose
    private String reference;
    private final static long serialVersionUID = 76503469357753639L;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

}
