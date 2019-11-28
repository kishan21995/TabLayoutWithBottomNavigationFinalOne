package com.app.tablayoutwithbottomnavigationfinalone.bottomNavigation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.tablayoutwithbottomnavigationfinalone.R;
import com.app.tablayoutwithbottomnavigationfinalone.tabLayout.TabFragment1;
import com.app.tablayoutwithbottomnavigationfinalone.tabLayout.TabFragment2;
import com.app.tablayoutwithbottomnavigationfinalone.tabLayout.TabFragment3;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class ItemOneFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public static ItemOneFragment newInstance() {
        ItemOneFragment fragment = new ItemOneFragment();
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
/*
        return inflater.inflate(R.layout.fragment_item_one, container, false);
*/



        View view= inflater.inflate(R.layout.fragment_item_one, container, false);


       /* tabLayout=(TabLayout)view.findViewById(R.id.tab_layout);
        viewPager=(ViewPager)view.findViewById(R.id.pager);
        setupViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();*/

        viewPager = (ViewPager)view.findViewById(R.id.pager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout)view.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        return view;

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager()); //getChildFragmentManager()
        adapter.addFragment(new TabFragment1(), "Community");
        adapter.addFragment(new TabFragment2(), "Household");
        adapter.addFragment(new TabFragment3(), "Activity");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment , String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}
