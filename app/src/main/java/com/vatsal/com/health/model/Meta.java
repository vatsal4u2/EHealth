package com.vatsal.com.health.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vatsalpatel on 2017-11-24.
 */


public class Meta {
    @SerializedName(value = "versionId")
    @Expose
    private String versionId;

    @SerializedName(value = "lastUpdated")
    @Expose
    private String lastUpdated;

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public String toString() {
        return "lastUpdated = " + lastUpdated + ", versionId = " + versionId;
    }
}

