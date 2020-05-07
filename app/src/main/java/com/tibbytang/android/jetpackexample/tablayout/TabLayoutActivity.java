package com.tibbytang.android.jetpackexample.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.tibbytang.android.jetpackexample.R;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        mTabLayout = this.findViewById(R.id.tablayout_view);
        mViewPager = this.findViewById(R.id.tab_view_pager);
        final List<String> words = new ArrayList<>();
        words.add("001");
        words.add("002");
        words.add("003");
        words.add("004");
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        TabFragmentAdapter tabFragmentAdapter = new TabFragmentAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        tabFragmentAdapter.setWords(words);
        mViewPager.setAdapter(tabFragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        for (int i = 0; i < words.size(); i++) {
            TabLayout.Tab tab = mTabLayout.getTabAt(i);
            View tabView = layoutInflater.inflate(R.layout.tab_item, null);
            tab.setCustomView(tabView);
        }
    }
}
