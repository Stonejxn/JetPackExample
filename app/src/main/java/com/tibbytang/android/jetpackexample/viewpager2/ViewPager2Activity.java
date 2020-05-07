package com.tibbytang.android.jetpackexample.viewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.tibbytang.android.jetpackexample.R;

import java.util.ArrayList;
import java.util.List;

import static androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT;

public class ViewPager2Activity extends AppCompatActivity {

    private ViewPager2 mViewPager2;
    private AppCompatButton mAddView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager2);
        mViewPager2 = this.findViewById(R.id.view_pager2_view);
        mViewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
        final List<String> words = new ArrayList<>();
        words.add("001");
        words.add("002");
        words.add("003");
        words.add("004");
        words.add("005");
        words.add("006");
        final WordFragmentAdapter wordFragmentAdapter = new WordFragmentAdapter(this);
        wordFragmentAdapter.setWords(words);
        mViewPager2.setAdapter(wordFragmentAdapter);
        mAddView = findViewById(R.id.add_view);
        mAddView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                words.add("007");
                words.add("008");
                words.add("009");
                words.add("010");
                words.add("011");
                words.add("012");
                wordFragmentAdapter.notifyItemRangeChanged(6, 6);
            }
        });
    }
}
