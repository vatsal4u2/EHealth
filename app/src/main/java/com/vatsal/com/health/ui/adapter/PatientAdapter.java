package com.vatsal.com.health.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vatsal.com.health.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by vatsalpatel on 2017-11-23.
 */

public class PatientAdapter extends RecyclerView.Adapter<PatientAdapter.ViewHolder> {

    private String[] mDataSet;
    private ListItemClickListener mListener;

    public PatientAdapter(String[] data) {
        mDataSet = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.patient_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mPatientName.setText(mDataSet[position]);
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

    public void setClickListener(ListItemClickListener listener) {
        mListener = listener;
    }

    public interface ListItemClickListener {
        void OnItemClick(int position);
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.patient_name)
        TextView mPatientName;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mListener.OnItemClick(getAdapterPosition());
        }
    }
}
