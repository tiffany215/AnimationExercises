package com.example.tweenanimation;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class InstanceAnimationActivity extends AppCompatActivity {

    private FrameLayout mSplashLayout, mLoadingLayout, mScanLayout;
    private ImageView splashImage, loadingImage, scanWave01, scanWave02, scanWave03,scanWave04;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instance_aniamtion);
        this.mContext = InstanceAnimationActivity.this;

        mScanLayout = findViewById(R.id.scanner_layout);
        mSplashLayout = findViewById(R.id.splash_scale_layout);
        mLoadingLayout = findViewById(R.id.loading_layout);


    }

    private void startScaleAnimation() {
        gone(mScanLayout,mLoadingLayout);
        visible(mSplashLayout);
        splashImage = findViewById(R.id.splash_scale_image);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f,1.2f,1.0f,1.2f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scaleAnimation.setDuration(3000);
        scaleAnimation.setFillAfter(true);
        splashImage.startAnimation(scaleAnimation);
    }

    private void startRotateAnimation() {
        gone(mScanLayout,mSplashLayout);
        visible(mLoadingLayout);
        loadingImage = findViewById(R.id.loading_image);
        RotateAnimation rotateAnimation = new RotateAnimation(0,360, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setDuration(3000);
        rotateAnimation.setRepeatCount(Animation.INFINITE);
        rotateAnimation.setRepeatMode(Animation.RESTART);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        loadingImage.startAnimation(rotateAnimation);
    }

    private void startScanAnimation() {
        gone(mSplashLayout,mLoadingLayout);
        visible(mScanLayout);
        scanWave01 = findViewById(R.id.scanner_wave_01);
        scanWave02 = findViewById(R.id.scanner_wave_02);
        scanWave03 = findViewById(R.id.scanner_wave_03);
        scanWave04 = findViewById(R.id.scanner_wave_04);


        final Animation animationWave01 = AnimationUtils.loadAnimation(mContext, R.anim.scale_alpha_animation);
        final Animation animationWave02 = AnimationUtils.loadAnimation(mContext, R.anim.scale_alpha_animation);
        final Animation animationWave03 = AnimationUtils.loadAnimation(mContext, R.anim.scale_alpha_animation);
        final Animation animationWave04 = AnimationUtils.loadAnimation(mContext, R.anim.scale_alpha_animation);

        scanWave04.startAnimation(animationWave04);

        animationWave01.setStartOffset(600);
        scanWave01.startAnimation(animationWave01);

        animationWave02.setStartOffset(1200);
        scanWave02.startAnimation(animationWave02);

        animationWave03.setStartOffset(1800);
        scanWave03.startAnimation(animationWave03);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_instance_animation, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.splash_scale:
                startScaleAnimation();
                break;

            case R.id.loading_anim:
                startRotateAnimation();
                break;

            case R.id.scanner_anim:
                startScanAnimation();
                break;
        }
        return true;
    }


    protected void gone(View... view) {
        for (int i = 0; i < view.length; i++) {
            view[i].setVisibility(View.GONE);
        }
    }

    protected void visible(View... view) {
        for (int i = 0; i < view.length; i++) {
            view[i].setVisibility(View.VISIBLE);
        }
    }
}
