package com.example.katiui.kati.foodDetail;

import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.katiui.R;

public class PagerViewHolder extends RecyclerView.ViewHolder {

    public PagerViewHolder(View itemView) {
        super(itemView);
    }

    public void setText(int position) {
        TextView tv = this.itemView.findViewById(R.id.textView);
        tv.setText("임시 광고 "+position);
    }
}
