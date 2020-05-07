package com.tibbytang.android.jetpackexample.viewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者:tibbytang
 * 微信:tibbytang19900607
 * 有问题加微信
 * 创建于:2020-05-07 13:41
 */
public class WordFragmentAdapter extends FragmentStateAdapter {
    private List<String> mWordList;

    public WordFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public void setWords(List<String> list) {
        mWordList = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return WordFragment.newInstance(mWordList.get(position));
    }

    @Override
    public int getItemCount() {
        return  mWordList.size();
    }
}
