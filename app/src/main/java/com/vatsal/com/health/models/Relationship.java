
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Relationship implements Serializable
{

    @SerializedName("coding")
    @Expose
    private List<Coding> coding = null;
    private final static long serialVersionUID = -5265912364669891838L;

    public List<Coding> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }

}
