package com.app.tablayoutwithbottomnavigationfinalone.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.app.tablayoutwithbottomnavigationfinalone.R;
import com.app.tablayoutwithbottomnavigationfinalone.bottomNavigation.ItemFiveFragment;
import com.app.tablayoutwithbottomnavigationfinalone.bottomNavigation.ItemFourFragment;
import com.app.tablayoutwithbottomnavigationfinalone.bottomNavigation.ItemOneFragment;
import com.app.tablayoutwithbottomnavigationfinalone.bottomNavigation.ItemThreeFragment;
import com.app.tablayoutwithbottomnavigationfinalone.bottomNavigation.ItemTwoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     /*   toolbar = getSupportActionBar();
          BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        toolbar.setTitle("Home");*/

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);


        BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        selectedFragment = ItemOneFragment.newInstance();
                        break;
                    case R.id.navigation_favourite:
                        selectedFragment = ItemTwoFragment.newInstance();
                        break;
                    case R.id.navigation_account:
                        selectedFragment = ItemThreeFragment.newInstance();
                        break;
                    case R.id.navigation_notification:
                        selectedFragment = ItemFourFragment.newInstance();
                        break;
                    case R.id.navigation_setting:
                        selectedFragment = ItemFiveFragment.newInstance();
                        break;
                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_container, selectedFragment);
                transaction.commit();
                return true;
            }

        };
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, ItemOneFragment.newInstance());
        transaction.commit();

        navigation.setOnNavigationItemSelectedListener
                (mOnNavigationItemSelectedListener);


    }


   /* private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    toolbar.setTitle("Home");

                    fragment = new ItemOneFragment();
                    loadFragment(fragment);

                    return true;
                case R.id.navigation_favourite:
                    toolbar.setTitle("Favourite");

                    fragment = new ItemTwoFragment();
                    loadFragment(fragment);

                    return true;
                case R.id.navigation_account:
                    toolbar.setTitle("Account");

                    fragment = new ItemThreeFragment();
                    loadFragment(fragment);

                    return true;
                case R.id.navigation_notification:
                    toolbar.setTitle("Notification");

                    fragment = new ItemFourFragment();
                    loadFragment(fragment);

                    return true;
                case R.id.navigation_setting:
                    toolbar.setTitle("Setting");

                    fragment = new ItemFiveFragment();
                    loadFragment(fragment);

                    return true;
            }
            return false;
        }
    };


    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }*/

}
