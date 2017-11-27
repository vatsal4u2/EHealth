package com.vatsal.com.health.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by vatsalpatel on 2017-11-24.
 */
@Database(entities = {PatientInfo.class}, version = 1, exportSchema = false)
public abstract class PatientDatabase extends RoomDatabase {

    private static final String DB_NAME = "Patients";
    private static PatientDatabase sPatientDatabase;

    public static PatientDatabase get() {
        return sPatientDatabase;
    }

    public static void get(Context context) {
        if (sPatientDatabase == null) {
            sPatientDatabase = Room
                    .databaseBuilder(context.getApplicationContext(), PatientDatabase.class, DB_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
    }
}
