package com.vatsal.com.health.ui.activities.patient_details;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.EditText;

import com.vatsal.com.health.R;
import com.vatsal.com.health.models.Patient;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PatientDetailsActivity extends AppCompatActivity implements PatientDetailsContract.View {

    private static String PARAM = "PARAM1";

    @BindView(R.id.edit_name)
    EditText mEditName;
    @BindView(R.id.edit_birthday)
    EditText mEditBirthday;
    @BindView(R.id.edit_gender)
    EditText mEditGender;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    PatientDetailsContract.Presenter mPresenter;

    public static void start(Context context, Patient patient) {
        Intent intent = new Intent(context, PatientDetailsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra(PARAM, patient);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("activity ", "onCreate - PatientDetailsActivity");
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        setTitle("");
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        Intent intent = getIntent();
        Patient patient = (Patient) intent.getSerializableExtra(PARAM);
        if (mPresenter == null) {
            mPresenter = new PatientDetailsPresenter();
        }

        mPresenter.parseArguments(patient);
        mPresenter.onStart(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return false;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void showProgress() {
        // mProgressbar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        //  mProgressbar.setVisibility(View.GONE);
    }

    @Override
    public void showError() {
        // mEmptyText.setVisibility(View.VISIBLE);
        // mEmptyText.setText(R.string.error_msg);
    }

    @Override
    public void setName(String name) {
        mEditName.setText(name);
    }

    @Override
    public void setBirthday(String birthday) {
        mEditBirthday.setText(birthday);
    }

    @Override
    public void setGender(String gender) {
        mEditGender.setText(gender);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onStop();
    }
}
