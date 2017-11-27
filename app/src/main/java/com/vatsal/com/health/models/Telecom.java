
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Telecom implements Serializable
{

    @SerializedName("system")
    @Expose
    private String system;
    @SerializedName("value")
    @Expose
    private String value;
    private final static long serialVersionUID = 5678820849769883309L;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
