package com.vatsal.com.health.ui.activities.patient_listing;

import com.vatsal.com.health.models.Patient;

import java.util.List;

/**
 * Created by vatsalpatel on 2017-11-25.
 */

class PatientListContract {

    interface View {
        void showProgress();

        void hideProgress();

        void setPatientAdapter(List<Patient> patientList);

        void showEmptyList();

        void showError();
    }


    interface Presenter {
        void onStart(View view);

        void onStop();
    }
}
