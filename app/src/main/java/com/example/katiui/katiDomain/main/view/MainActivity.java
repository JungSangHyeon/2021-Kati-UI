package com.example.katiui.katiDomain.main.view;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.viewpager2.widget.ViewPager2;

import com.example.katiui.R;
import com.example.katiui.jshCrossDomain.JSHViewPagerTool;
import com.example.katiui.katiDomain.main.view.advertisement.AdvertisementViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = this.findViewById(R.id.mainFragment_bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
            switch(item.getItemId()){
                case R.id.action_home: navController.navigate(R.id.action_global_mainFragment); break;
                case R.id.action_favorite: break;
                case R.id.action_search: break;
                case R.id.action_find_market: break;
                case R.id.action_mykati: navController.navigate(R.id.action_mainFragment_to_myKatiFragment); break;
            }
            return true;
        });
    }


}