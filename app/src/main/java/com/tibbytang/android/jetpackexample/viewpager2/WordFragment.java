package com.tibbytang.android.jetpackexample.viewpager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import com.tibbytang.android.jetpackexample.R;

/**
 * 作者:tibbytang
 * 微信:tibbytang19900607
 * 有问题加微信
 * 创建于:2020-05-07 13:37
 */
public class WordFragment extends Fragment {
    private AppCompatTextView mWordAppCompTextView;

    public static WordFragment newInstance(String text) {

        Bundle args = new Bundle();

        WordFragment fragment = new WordFragment();
        args.putString("text", text);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_word, container, false);
        mWordAppCompTextView = view.findViewById(R.id.word_text_view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mWordAppCompTextView.setText(getArguments().getString("text"));
    }
}
