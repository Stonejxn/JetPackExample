package com.tibbytang.android.jetpackexample.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.tibbytang.android.jetpackexample.viewpager2.WordFragment;

import java.util.List;

/**
 * 作者:tibbytang
 * 微信:tibbytang19900607
 * 有问题加微信
 * 创建于:2020-05-07 13:41
 */
public class TabFragmentAdapter extends FragmentPagerAdapter {
    private List<String> mWordList;

    public TabFragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public void setWords(List<String> list) {
        mWordList = list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return WordFragment.newInstance(mWordList.get(position));
    }

    @Override
    public int getCount() {
        return mWordList == null ? 0 : mWordList.size();
    }
}
