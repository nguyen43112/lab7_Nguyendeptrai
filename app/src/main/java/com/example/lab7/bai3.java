package com.example.lab7;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class bai3 extends AppCompatActivity   {
    ImageView imgHour, imgMinute, imgSecond;
    Button btnRun;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai3layout);
        imgHour = (ImageView)findViewById(R.id.imgHour);
        imgMinute = (ImageView)findViewById(R.id.imgMinute);
        imgSecond = (ImageView)findViewById(R.id.imgSecond);
        btnRun = (Button)findViewById(R.id.btnRun);

        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  dest = 360;
                if (imgHour.getRotation() == 360){
                    System.out.println(imgHour.getAlpha());
                    dest = 0;
                }
                ObjectAnimator animation1 = ObjectAnimator.ofFloat(imgHour,"rotation",dest);
                animation1.setDuration(12000000);
                animation1.start();

                if (imgMinute.getRotation() == 360){
                    System.out.println(imgMinute.getAlpha());
                    dest = 0;
                }
                ObjectAnimator animation2 = ObjectAnimator.ofFloat(imgMinute,"rotation",dest);
                animation2.setDuration(800000);
                animation2.start();

                if (imgSecond.getRotation() == 360){
                    System.out.println(imgSecond.getAlpha());
                    dest = 0;
                }
                ObjectAnimator animation3 = ObjectAnimator.ofFloat(imgSecond,"rotation",dest);
                animation3.setDuration(60000);
                animation3.start();
            }
        });
    }
}







