package com.example.katiui.kati.foodDetail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.katiui.R;

public class ViewPagerAdapter extends RecyclerView.Adapter<PagerViewHolder> {

    @Override
    public PagerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if(viewType==0){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_food_info, parent, false);
        }else if(viewType==1){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_review, parent, false);
        }else{
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_extra_info, parent, false);
        }
        return new PagerViewHolder(view);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public void onBindViewHolder(PagerViewHolder holder, int position) {
    }

    @Override public int getItemCount() { return 3; }
}