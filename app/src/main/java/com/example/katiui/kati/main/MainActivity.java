package com.example.katiui.kati.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.katiui.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

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
                case R.id.action_favorite: navController.navigate(R.id.action_global_favoriteFragment); break;
                case R.id.action_search: navController.navigate(R.id.action_global_searchFragment); break;
                case R.id.action_find_market: break;
                case R.id.action_mykati: navController.navigate(R.id.action_global_myKatiFragment); break;
            }
            return true;
        });
    }


}