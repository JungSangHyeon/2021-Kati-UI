package com.example.katiui.kati.main.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.katiui.R;
import com.example.katiui.jshCrossDomain.JSHViewPagerTool;
import com.example.katiui.kati.main.home.advertisement.AdvertisementViewPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewPager2 viewPager2 = view.findViewById(R.id.main_viewPager);
        viewPager2.setAdapter(new AdvertisementViewPagerAdapter());
        JSHViewPagerTool.setAutoSlide(viewPager2, 5000);
        JSHViewPagerTool.setEffect(viewPager2);
    }
}