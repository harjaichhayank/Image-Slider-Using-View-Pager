package com.example.imagesliderusingviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    int[] imageResources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       imageResources = new int[]{R.drawable.skeleton1,R.drawable.skeleton2,R.drawable.skeleton3,
               R.drawable.skeleton4,R.drawable.skeleton5,R.drawable.skeleton6,
               R.drawable.skeleton7,R.drawable.skeleton8,R.drawable.skeleton9,
               R.drawable.skeleton10,R.drawable.skeleton11,R.drawable.skeleton12,
               R.drawable.skeleton13,R.drawable.skeleton14,R.drawable.skeleton15};

       viewPager = findViewById(R.id.ViewPager);
       adapter = new CustomSwipeAdapter(this,imageResources);
       viewPager.setAdapter(adapter);
    }
}
