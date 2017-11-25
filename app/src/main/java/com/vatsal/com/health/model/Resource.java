package com.vatsal.com.health.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vatsalpatel on 2017-11-24.
 */


public class Resource {

    @SerializedName(value = "id")
    @Expose
    private String id;

    @SerializedName(value = "name")
    @Expose
    private Name[] name;

    @SerializedName(value = "gender")
    @Expose
    private String gender;

    @SerializedName(value = "birthDate")
    @Expose
    private String birthDate;

    @SerializedName(value = "meta")
    @Expose
    private Meta[] meta;


    public Name[] getName() {
        return name;
    }

    public void setName(Name[] name) {
        this.name = name;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Meta[] getMeta() {
        return meta;
    }

    public void setMeta(Meta[] meta) {
        this.meta = meta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "name = " + name + ",gender = " + gender + ", birthDate = " + birthDate +", meta" +
                "= " + meta + ", id = "+ id;
    }
}