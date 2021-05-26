package com.example.katiui.kati.main.home.advertisement;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.katiui.R;

public class AdvertisementViewPagerAdapter extends RecyclerView.Adapter<AdvertisementViewHolder> {

    @Override
    public AdvertisementViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_advertisement, parent, false);
        return new AdvertisementViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdvertisementViewHolder holder, int position) {
        holder.setText(position);
    }

    @Override public int getItemCount() { return 5; }
}