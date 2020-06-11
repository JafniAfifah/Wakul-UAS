package com.example.wakul.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.wakul.Login;
import com.example.wakul.R;

public class FirstLayout extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;


    //Hooks
    View gambar;
    TextView judul,slogan;

    //Animations
    Animation topAnimation, buttomAnimation, middleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.first_layout);

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        buttomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnimation = AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        //Hooks

        gambar = findViewById(R.id.image);
        judul = findViewById(R.id.tv);
        slogan = findViewById(R.id.ln);

        gambar.setAnimation(topAnimation);
        judul.setAnimation(middleAnimation);
        slogan.setAnimation(buttomAnimation);

        //Splash screen

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(FirstLayout.this, Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);

        }
    }
