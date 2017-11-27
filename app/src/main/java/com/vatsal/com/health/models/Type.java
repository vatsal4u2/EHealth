
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Type implements Serializable
{

    @SerializedName("coding")
    @Expose
    private List<Coding_> coding = null;
    private final static long serialVersionUID = 3193156787875423011L;

    public List<Coding_> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding_> coding) {
        this.coding = coding;
    }

}
