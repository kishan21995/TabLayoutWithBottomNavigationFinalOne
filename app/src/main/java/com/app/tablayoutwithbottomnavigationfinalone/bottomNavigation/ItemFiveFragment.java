package com.app.tablayoutwithbottomnavigationfinalone.bottomNavigation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.tablayoutwithbottomnavigationfinalone.R;


public class ItemFiveFragment extends Fragment {


    public static ItemFiveFragment newInstance() {
        ItemFiveFragment fragment = new ItemFiveFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item_five, container, false);
    }
}
