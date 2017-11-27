
package com.vatsal.com.health.models;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta_ implements Serializable
{

    @SerializedName("versionId")
    @Expose
    private String versionId;
    @SerializedName("lastUpdated")
    @Expose
    private String lastUpdated;
    @SerializedName("tag")
    @Expose
    private List<Tag> tag = null;
    @SerializedName("profile")
    @Expose
    private List<String> profile = null;
    private final static long serialVersionUID = -7431001213964698459L;

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    public List<String> getProfile() {
        return profile;
    }

    public void setProfile(List<String> profile) {
        this.profile = profile;
    }

}
