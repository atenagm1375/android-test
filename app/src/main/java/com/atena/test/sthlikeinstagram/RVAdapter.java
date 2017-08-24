package com.atena.test.sthlikeinstagram;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Majid on 8/24/2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.DataViewHolder> {

    public static class DataViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imageView;
        TextView title;
        TextView description;

        public DataViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            title = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
        }
    }

    List<Data> dataset;

    RVAdapter(List<Data> data) {
        dataset = data;
    }
    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler, parent, false);
        return new DataViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        holder.imageView.setImageResource(dataset.get(position).imageId);
        holder.title.setText(dataset.get(position).title);
        holder.description.setText(dataset.get(position).description);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
