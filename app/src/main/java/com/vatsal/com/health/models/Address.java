
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Address implements Serializable
{

    @SerializedName("use")
    @Expose
    private String use;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("line")
    @Expose
    private List<String> line = null;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("postalCode")
    @Expose
    private String postalCode;
    @SerializedName("country")
    @Expose
    private String country;
    private final static long serialVersionUID = -401975830735537591L;

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

    public List<String> getLine() {
        return line;
    }

    public void setLine(List<String> line) {
        this.line = line;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
