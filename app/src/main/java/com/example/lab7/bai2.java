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

public class bai2 extends AppCompatActivity   {
    Button bntall1, bntdore, bntznobo;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2layout);
        imageView = (ImageView) findViewById(R.id.imgview);
        bntall1 = (Button) findViewById(R.id.bntall);
        bntdore = (Button) findViewById(R.id.bntdo);
        bntznobo = (Button) findViewById(R.id.bntno);
        bntall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("all");
            }
        });

        bntdore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("doraremon");
            }
        });

        bntznobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage("nobita");
            }
        });
    }

    private void showImage(String img) {
        ObjectAnimator anim = ObjectAnimator.ofFloat(imageView, "translationX", 0f, 400f);
        anim.setDuration(1000);
        ObjectAnimator anim1 = ObjectAnimator.ofFloat(imageView, "alpha",1f,0f);
        anim1.setDuration(1000);

        //show Image
        ObjectAnimator anim2 = ObjectAnimator.ofFloat(imageView, "translationX", -400f, 0f);
        anim2.setDuration(1000);
        ObjectAnimator anim3 = ObjectAnimator.ofFloat(imageView, "alpha", 0f, 1f);
        anim3.setDuration(1000);


        AnimatorSet ans = new AnimatorSet();
        ans.play(anim2).with(anim3).after(anim).after(anim1);
        ans.start();

        final String imgName = img;
        anim2.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if (imgName == "all"){
                    imageView.setImageResource(R.drawable.all);
                }
                if (imgName == "nobita"){
                    imageView.setImageResource(R.drawable.nobita);
                }
                if (imgName == "doraremon"){
                    imageView.setImageResource(R.drawable.doraemon);
                }

            }

            @Override
            public void onAnimationCancel(Animator animation) {



            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }
}





