package com.example.wakul.Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wakul.UserDasboard;
import com.example.wakul.HelperClasses.SliderAdapter;
import com.example.wakul.R;

public class OnBoarding extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout dotsLayout;
    TextView[] dots;
    Button letsGetStarted;

    SliderAdapter sliderAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_on_boarding);

        //Hooks
         viewPager = findViewById(R. id.slider);
         dotsLayout = findViewById(R.id.dots);
         letsGetStarted = findViewById(R.id.start_btn);

         //CallAdapter
        sliderAdapter = new SliderAdapter(this);
         viewPager.setAdapter(sliderAdapter);

         addDots(0);
         viewPager.addOnPageChangeListener(changeListener);

    }

    private void addDots(int position){

        dots = new TextView[2];
        dotsLayout.removeAllViews();

        for(int i=0; i<dots.length; i++){
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);

            dotsLayout.addView(dots[i]);
        }

        if(dots.length > 0){
           dots[position].setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }

    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);

            if(position == 0){
                letsGetStarted.setVisibility(View.INVISIBLE);
            }
            else {
                letsGetStarted.setVisibility(View.VISIBLE);
            }
            letsGetStarted.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(OnBoarding.this, UserDasboard.class);
                    startActivity(intent);
                    finish();

                }
            });
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

}
