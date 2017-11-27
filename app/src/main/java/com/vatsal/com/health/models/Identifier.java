
package com.vatsal.com.health.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Identifier implements Serializable
{

    @SerializedName("use")
    @Expose
    private String use;
    @SerializedName("system")
    @Expose
    private String system;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("type")
    @Expose
    private Type type;
    @SerializedName("period")
    @Expose
    private Period_ period;
    @SerializedName("assigner")
    @Expose
    private Assigner assigner;
    private final static long serialVersionUID = -5432167015913905918L;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Period_ getPeriod() {
        return period;
    }

    public void setPeriod(Period_ period) {
        this.period = period;
    }

    public Assigner getAssigner() {
        return assigner;
    }

    public void setAssigner(Assigner assigner) {
        this.assigner = assigner;
    }

}
