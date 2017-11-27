package com.vatsal.com.health.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vatsal.com.health.R;
import com.vatsal.com.health.models.Name;
import com.vatsal.com.health.models.Patient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by vatsalpatel on 2017-11-23.
 */

public class PatientAdapter extends RecyclerView.Adapter<PatientAdapter.ViewHolder> {

    private List<Patient> patientList;
    private ItemClickListener mListener;

    public PatientAdapter() {

    }

    public void bindListener(ItemClickListener listener) {
        mListener = listener;
    }

    public void addItems(List<Patient> patientList) {
        this.patientList = patientList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.patient_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {


        String name = "";
        Name nameObj = patientList.get(position).getResource().getContact().get(0).getName();
        for (String stringObj : nameObj.getGiven()) {
            if (!TextUtils.isEmpty(stringObj))
                name = stringObj;
        }

        if (!TextUtils.isEmpty(nameObj.getFamily())) {
            name = name + " " + nameObj.getFamily();
        }

        holder.mPatientName.setText(name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) mListener.OnItemClick(patientList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        if (patientList == null)
            return 0;
        return patientList.size();
    }

    public interface ItemClickListener {
        void OnItemClick(Patient patient);
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.patient_name)
        TextView mPatientName;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
