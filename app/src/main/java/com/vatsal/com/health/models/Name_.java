
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Name_ implements Serializable
{

    @SerializedName("use")
    @Expose
    private String use;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("family")
    @Expose
    private String family;
    @SerializedName("given")
    @Expose
    private List<String> given = null;
    @SerializedName("prefix")
    @Expose
    private List<String> prefix = null;
    private final static long serialVersionUID = -8515125136227194645L;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

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

    public List<String> getPrefix() {
        return prefix;
    }

    public void setPrefix(List<String> prefix) {
        this.prefix = prefix;
    }

}
