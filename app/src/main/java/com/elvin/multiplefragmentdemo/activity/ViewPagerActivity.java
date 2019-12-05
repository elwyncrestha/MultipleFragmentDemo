package com.elvin.multiplefragmentdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.elvin.multiplefragmentdemo.R;
import com.elvin.multiplefragmentdemo.adapter.ViewPagerAdapter;
import com.elvin.multiplefragmentdemo.fragment.CircleFragment;
import com.elvin.multiplefragmentdemo.fragment.SumFragment;
import com.google.android.material.tabs.TabLayout;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        this.viewPager = findViewById(R.id.viewPager);
        this.tabLayout = findViewById(R.id.tabLayout);

        this.tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment("Sum", new SumFragment());
        viewPagerAdapter.addFragment("Area of circle", new CircleFragment());

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
