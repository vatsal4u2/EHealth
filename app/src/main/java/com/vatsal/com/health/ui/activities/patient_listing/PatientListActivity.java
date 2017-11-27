package com.vatsal.com.health.ui.activities.patient_listing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.vatsal.com.health.R;
import com.vatsal.com.health.models.Patient;
import com.vatsal.com.health.ui.activities.patient_details.PatientDetailsActivity;
import com.vatsal.com.health.ui.adapter.PatientAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PatientListActivity extends AppCompatActivity implements PatientListContract.View {
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.empty_view)
    TextView mEmptyText;
    @BindView(R.id.progress)
    ProgressBar mProgressbar;
    PatientAdapter patientAdapter;

    PatientListContract.Presenter mPresenter;
    private PatientAdapter.ItemClickListener itemClickListener = new PatientAdapter.ItemClickListener() {
        @Override
        public void OnItemClick(Patient patient) {
            startDetailedActivity(patient);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        initViews();

        if (mPresenter == null) {
            mPresenter = new PatientListPresenter();
        }

        mPresenter.onStart(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_refresh:
                Toast.makeText(this, "Refresh Menu Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_sort:
                Toast.makeText(this, "Sort Menu Selected", Toast.LENGTH_SHORT).show();
                break;
            default:
                super.onOptionsItemSelected(item);
        }

        return false;
    }

    private void initViews() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);
        patientAdapter = new PatientAdapter();
        patientAdapter.bindListener(itemClickListener);
        mRecyclerView.setAdapter(patientAdapter);
    }

    private void startDetailedActivity(Patient patient) {
        PatientDetailsActivity.start(this, patient);
    }

    @Override
    public void setPatientAdapter(List<Patient> patientList) {
        if (patientList == null || patientList.isEmpty()) {
            showEmptyList();
        } else {
            mEmptyText.setVisibility(View.GONE);
            patientAdapter.addItems(patientList);
        }
    }

    @Override
    public void showProgress() {
        mProgressbar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressbar.setVisibility(View.GONE);
    }

    @Override
    public void showEmptyList() {
        mRecyclerView.setVisibility(View.GONE);
        mEmptyText.setVisibility(View.VISIBLE);
        mEmptyText.setText(R.string.empty_list);
    }

    @Override
    public void showError() {
        mRecyclerView.setVisibility(View.GONE);
        mEmptyText.setVisibility(View.VISIBLE);
        mEmptyText.setText(R.string.error_msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onStop();
    }
}
