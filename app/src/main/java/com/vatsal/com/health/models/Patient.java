
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Patient implements Serializable
{

    @SerializedName("fullUrl")
    @Expose
    private String fullUrl;
    @SerializedName("resource")
    @Expose
    private Resource resource;
    @SerializedName("search")
    @Expose
    private Search search;
    private final static long serialVersionUID = -6436685025161321429L;

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

}
