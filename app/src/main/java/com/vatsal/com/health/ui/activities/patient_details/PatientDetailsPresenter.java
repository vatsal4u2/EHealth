package com.vatsal.com.health.ui.activities.patient_details;

import android.text.TextUtils;

import com.vatsal.com.health.models.Patient;

/**
 * Created by vatsalpatel on 2017-11-25.
 */

class PatientDetailsPresenter implements PatientDetailsContract.Presenter {
    private String TAG = PatientDetailsPresenter.class.getSimpleName();
    private PatientDetailsContract.View view;
    private Patient mPatient;

    @Override
    public void onStart(PatientDetailsContract.View view) {
        this.view = view;

        if(mPatient != null){
           String name =  mPatient.getResource().getContact().get(0).getName().getFamily();
           if(!TextUtils.isEmpty(name)){
               view.setName(name);
           }
           String birthday = mPatient.getResource().getBirthDate();
           if(!TextUtils.isEmpty(birthday)){
               view.setBirthday(birthday);
           }

           String gender = mPatient.getResource().getGender();
           if(!TextUtils.isEmpty(gender)){
               view.setGender(gender);
           }
        }

    }


    @Override
    public void parseArguments(Patient patient) {
        mPatient = patient;
    }

    private void fetchPatientList() {
        /*EHealthApiService apiService = RetrofitClient.getClient();
        Call<PatientResponseInfo> call = apiService.getPatience(100);
        call.enqueue(new Callback<PatientResponseInfo>() {
            @Override
            public void onResponse(@NonNull Call<PatientResponseInfo> call, @NonNull Response<PatientResponseInfo> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null && response.body().getEntry() != null) {
                        patientList = response.body().getEntry();
                        filterList();
                        view.setPatientAdapter(patientList);
                    } else {
                        view.showEmptyList();
                    }
                } else {
                    view.showError();
                    Log.e(TAG, "Error");
                }

                view.hideProgress();
            }

            @Override
            public void onFailure(Call<PatientResponseInfo> call, Throwable t) {
                view.hideProgress();
                view.showError();
                Log.e(TAG, t.getLocalizedMessage());
            }
        });*/
    }

    @Override
    public void onStop() {
        view = new PatientDetailsActivity();
    }
}
