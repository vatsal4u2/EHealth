package com.vatsal.com.health.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.io.Serializable;

import static com.vatsal.com.health.database.PatientInfo.TABLE_NAME;

/**
 * Created by vatsalpatel on 2017-11-24.
 */
@Entity(tableName = TABLE_NAME, indices = {@Index(value = {"id"}, unique = true)})
public class PatientInfo implements Serializable {

    public static final String TABLE_NAME = "patient_info";

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    public String id;

    @ColumnInfo(name = "versionId")
    public String versionId;

    @ColumnInfo(name = "lastUpdated")
    public String lastUpdated;

    @ColumnInfo(name = "birthDate")
    public String birthDate;

    @ColumnInfo(name = "gender")
    public String gender;

    @ColumnInfo(name = "name")
    public String name;
}
