package com.example.lab7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class bai1 extends AppCompatActivity implements View.OnClickListener {
    Button bntroving, bntmoveng, bntzooom;
    ImageView imageView;
    Animation zoom, quayv, chayngaydi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai1layout);
        Nguyen();
        oncln();
        animation();
    }

    private void oncln() {
        bntzooom.setOnClickListener(this);
        bntroving.setOnClickListener(this);
        bntmoveng.setOnClickListener(this);
    }

    private void Nguyen() {
        imageView = (ImageView) findViewById(R.id.imghinh);
        bntroving = (Button) findViewById(R.id.bntroll);
        bntmoveng = (Button) findViewById(R.id.bntmoving);
        bntzooom = (Button) findViewById(R.id.bntzoom);
    }

    private void animation() {
        zoom = AnimationUtils.loadAnimation(this, R.anim.zoom);
        quayv = AnimationUtils.loadAnimation(this, R.anim.quayvong);
        chayngaydi = AnimationUtils.loadAnimation(this, R.anim.moving);
    }

    @Override
    public void onClick(View v) {
        if (v == bntzooom) {
            imageView.startAnimation(zoom);
        }
        if (v == bntroving) {
            imageView.startAnimation(quayv);
        }
        if (v == bntmoveng) {
            imageView.startAnimation(chayngaydi);
        }
    }
}
