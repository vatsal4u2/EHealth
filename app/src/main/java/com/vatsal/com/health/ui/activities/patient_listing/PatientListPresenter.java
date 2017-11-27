package com.vatsal.com.health.ui.activities.patient_listing;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.vatsal.com.health.models.Contact;
import com.vatsal.com.health.models.Name;
import com.vatsal.com.health.models.Patient;
import com.vatsal.com.health.models.PatientResponseInfo;
import com.vatsal.com.health.retrofit.EHealthApiService;
import com.vatsal.com.health.retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by vatsalpatel on 2017-11-25.
 */

class PatientListPresenter implements PatientListContract.Presenter {
    private String TAG = PatientListPresenter.class.getSimpleName();
    private PatientListContract.View view;
    private List<Patient> patientList;

    @Override
    public void onStart(PatientListContract.View view) {
        this.view = view;

        if (patientList == null) {
            fetchPatientList();
        } else {
            view.setPatientAdapter(patientList);
        }
    }

    private void fetchPatientList() {
        EHealthApiService apiService = RetrofitClient.getClient();
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
        });
    }


    private void filterList() {
        List<Patient> filteredList = new ArrayList<>();
        if (patientList == null) {
            patientList = filteredList;
            return;
        }

        for (Patient patient : patientList) {
            if (patient.getResource() == null
                    || patient.getResource().getContact() == null
                    || patient.getResource().getContact().size() == 0)
                continue;

            boolean hasAtLeastOneName = false;
            List<Contact> contactList = patient.getResource().getContact();
            for (Contact contact : contactList) {
                if (contact.getName() != null && hasGivenName(contact.getName())) {
                    hasAtLeastOneName = true;
                    break;
                }
            }

            if (hasAtLeastOneName) {
                filteredList.add(patient);
            }
        }

        patientList = filteredList;
    }


    private boolean hasGivenName(Name nameObj) {
        if (nameObj.getGiven() == null || nameObj.getGiven().size() == 0)
            return false;

        for (String name : nameObj.getGiven()) {
            if (!TextUtils.isEmpty(name)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void onStop() {
        view = new PatientListActivity();
    }
}
