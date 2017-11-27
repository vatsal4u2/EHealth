
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Telecom_ implements Serializable
{

    @SerializedName("system")
    @Expose
    private String system;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("use")
    @Expose
    private String use;
    private final static long serialVersionUID = -7933956752252543819L;

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

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

}
