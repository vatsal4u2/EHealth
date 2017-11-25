package com.vatsal.com.health.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.vatsal.com.health.R;
import com.vatsal.com.health.ui.adapter.PatientAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PatientListActivity extends AppCompatActivity implements PatientAdapter.ListItemClickListener {
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.empty_view)
    TextView mEmptyText;
    @BindView(R.id.progress)
    ProgressBar mProgressbar;

    public String[] data = {"Vats!","Har!","Rad!","Jaspreet!","Ketul!","Radhika!"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        initViews();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_refresh:
                Toast.makeText(this,"Refresh Menu Selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_sort:
                Toast.makeText(this,"Sort Menu Selected",Toast.LENGTH_SHORT).show();
                break;
            default:super.onOptionsItemSelected(item);
        }
        return false;
    }

    @Override
    public void OnItemClick(int position) {
        Toast.makeText(this,"List item clicked",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,DetailActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void initViews(){
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        PatientAdapter mAdapter = new PatientAdapter(data);
        mAdapter.setClickListener(this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
