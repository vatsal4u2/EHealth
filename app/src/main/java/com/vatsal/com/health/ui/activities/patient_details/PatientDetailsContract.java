package com.vatsal.com.health.ui.activities.patient_details;

import com.vatsal.com.health.models.Patient;

/**
 * Created by vatsalpatel on 2017-11-25.
 */

class PatientDetailsContract {

    interface View {
        void showProgress();
        void hideProgress();
        void showError();
        void setName(String name);
        void setBirthday(String birthday);
        void setGender(String gender);
    }


    interface Presenter {
        void onStart(View view);

        void parseArguments(Patient patient);
        void onStop();
    }
}
