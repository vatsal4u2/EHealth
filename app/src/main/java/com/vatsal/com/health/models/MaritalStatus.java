
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class MaritalStatus implements Serializable
{

    @SerializedName("coding")
    @Expose
    private List<Coding__> coding = null;
    private final static long serialVersionUID = -4993473638685049129L;

    public List<Coding__> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding__> coding) {
        this.coding = coding;
    }

}
