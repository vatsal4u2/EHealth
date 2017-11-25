package com.vatsal.com.health.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vatsalpatel on 2017-11-24.
 */

public class PatientList {

    @SerializedName(value = "id")
    @Expose
    private String id;

    @SerializedName(value = "entry")
    @Expose
    private Entry[] entry;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Entry[] getEntry() {
        return entry;
    }

    public void setEntry(Entry[] entry) {
        this.entry = entry;
    }


    @Override
    public String toString() {
        return " id = " + id + ", entry = " + entry;
    }
}