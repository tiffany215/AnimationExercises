package com.example.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ScanAnimationActivity extends AppCompatActivity {


    private ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_animation2);
        mImageView = findViewById(R.id.image_01);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.scale_alpha_anim);
        mImageView.startAnimation(animation);

    }
}
