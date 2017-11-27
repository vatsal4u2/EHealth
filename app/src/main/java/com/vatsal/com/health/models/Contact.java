
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Contact implements Serializable
{

    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("telecom")
    @Expose
    private List<Telecom> telecom = null;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("period")
    @Expose
    private Period period;
    @SerializedName("relationship")
    @Expose
    private List<Relationship> relationship = null;
    private final static long serialVersionUID = 4351425839289201096L;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<Telecom> getTelecom() {
        return telecom;
    }

    public void setTelecom(List<Telecom> telecom) {
        this.telecom = telecom;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public List<Relationship> getRelationship() {
        return relationship;
    }

    public void setRelationship(List<Relationship> relationship) {
        this.relationship = relationship;
    }

}
