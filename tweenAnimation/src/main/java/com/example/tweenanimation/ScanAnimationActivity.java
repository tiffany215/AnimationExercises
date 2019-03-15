package com.example.tweenanimation;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ScanAnimationActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_animation);
        this.mContext = ScanAnimationActivity.this;

        final Animation animation01 = AnimationUtils.loadAnimation(mContext, R.anim.scale_alpha_anim);
        final Animation animation02 = AnimationUtils.loadAnimation(mContext, R.anim.scale_alpha_anim);
        final Animation animation03 = AnimationUtils.loadAnimation(mContext, R.anim.scale_alpha_anim);
        final Animation animation04 = AnimationUtils.loadAnimation(mContext, R.anim.scale_alpha_anim);


        final ImageView circle01 = findViewById(R.id.circle1);
        final ImageView circle02 = findViewById(R.id.circle2);
        final ImageView circle03 = findViewById(R.id.circle3);
        final ImageView circle04 = findViewById(R.id.circle4);


        findViewById(R.id.start_can).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle01.startAnimation(animation01);

                animation02.setStartOffset(600);
                circle02.startAnimation(animation02);
//
                animation03.setStartOffset(1200);
                circle03.startAnimation(animation03);
//
                animation04.setStartOffset(1800);
                circle04.startAnimation(animation04);
            } 
        });

    }
}
