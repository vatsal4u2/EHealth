package com.vatsal.com.health.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vatsalpatel on 2017-11-24.
 */


public class Entry {
    @SerializedName(value = "resource")
    @Expose
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "[resource = " + resource + "]";
    }
}
