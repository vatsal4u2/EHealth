
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Coding__ implements Serializable
{

    @SerializedName("system")
    @Expose
    private String system;
    @SerializedName("code")
    @Expose
    private String code;
    private final static long serialVersionUID = 4125524946867121109L;

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
