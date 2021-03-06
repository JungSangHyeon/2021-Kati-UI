package com.example.katiui.kati.main.search;

import android.content.Context;
import android.content.Intent;
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
import com.example.katiui.kati.foodDetail.FoodDetailActivity;
import com.example.katiui.kati.main.favorite.FavoriteFragment;

import org.jetbrains.annotations.NotNull;

public class SearchResultFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search_result, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rv = view.findViewById(R.id.searchResult_advertisementList);
        rv.setAdapter(new Adapter(0));
        rv.setNestedScrollingEnabled(false);

        RecyclerView rv2 = view.findViewById(R.id.searchResult_result);
        rv2.setAdapter(new Adapter(1));
        rv2.setNestedScrollingEnabled(false);
    }

    private class Adapter extends RecyclerView.Adapter<ViewHolder>{

        int i;
        public Adapter(int i) {
            this.i=i;
        }

        @NonNull
        @NotNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
            View view;
            if(i==0){
                view =  ((LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.item_food_vertical, parent, false);
            }else{
                view =  ((LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.item_food, parent, false);
            }
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }
    private class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(v->getActivity().startActivity(new Intent(getContext(), FoodDetailActivity.class)));
        }
    }
}