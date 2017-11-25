package com.vatsal.com.health;

import android.app.Application;

import com.vatsal.com.health.database.PatientDatabase;

/**
 * Created by vatsalpatel on 2017-11-24.
 */

public class HealthApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Initialize the Room DB
        PatientDatabase.get(getApplicationContext());
    }
}
