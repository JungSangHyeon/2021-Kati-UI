package com.example.katiui.kati.main.favorite;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.katiui.R;

import org.jetbrains.annotations.NotNull;

public class FavoriteFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_favorite, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rv = view.findViewById(R.id.favorite_list);
        rv.setLayoutManager(new LinearLayoutManager(this.getContext()));
        rv.setAdapter(new Adapter());
    }

    private class Adapter extends RecyclerView.Adapter<ViewHolder>{

        @NonNull
        @NotNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
            View view;
            if(viewType==1){
                view =  ((LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.item_food, parent, false);
            }else{
                view =  ((LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.item_count, parent, false);
            }
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        }

        @Override
        public int getItemViewType(int position) {
            if(position==0) return 0;
            else return 1;
        }

        @Override
        public int getItemCount() {
            return 4;
        }
    }
    private class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
    }
}