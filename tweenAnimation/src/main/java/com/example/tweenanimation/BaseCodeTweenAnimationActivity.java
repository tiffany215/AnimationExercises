package com.example.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class BaseCodeTweenAnimationActivity extends AppCompatActivity {

    private Animation mAnimation;
    private TextView mTextView;
    private final static int DURATION_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_code_tween_animation);
        mTextView = findViewById(R.id.textView2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_base_animtion, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(null != mAnimation){
            mAnimation.cancel();
            mAnimation = null;
        }
        switch (item.getItemId()) {
            case R.id.alpha_animation:
                mAnimation = new AlphaAnimation(1.0f, 0f);
                mAnimation.setDuration(DURATION_TIME);
                mAnimation.setFillBefore(true);
                mAnimation.setRepeatCount(Animation.INFINITE);
                mAnimation.setRepeatMode(Animation.REVERSE);
                mTextView.startAnimation(mAnimation);
                break;

            case R.id.scale_animation:
                mAnimation = new ScaleAnimation(1f, 1.4f, 1f, 1.4f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                mAnimation.setRepeatMode(Animation.REVERSE);
                mAnimation.setRepeatCount(Animation.INFINITE);
                mAnimation.setDuration(DURATION_TIME);
                mAnimation.setFillAfter(true);
                mTextView.startAnimation(mAnimation);
                break;

            case R.id.rotate_animation:
                mAnimation = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                mAnimation.setDuration(DURATION_TIME);
                mAnimation.setRepeatCount(Animation.INFINITE);
                mAnimation.setRepeatMode(Animation.REVERSE);
                mAnimation.setFillAfter(true);
                mTextView.startAnimation(mAnimation);
                break;

            case R.id.set_animation:
                AnimationSet set = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0f);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1f, 1.4f, 1f, 1.4f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                RotateAnimation rotateAnimation = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                set.addAnimation(alphaAnimation);
                set.addAnimation(scaleAnimation);
                set.addAnimation(rotateAnimation);
                set.setDuration(DURATION_TIME);
                set.setRepeatMode(Animation.REVERSE);
                set.setRepeatCount(Animation.INFINITE);
                set.setFillAfter(true);
                mTextView.startAnimation(set);
                break;

            case R.id.translate_animation:
                mAnimation = new TranslateAnimation(0,0,500,500,Animation.RELATIVE_TO_PARENT,0.2f,Animation.RELATIVE_TO_PARENT,0.2f);
                mAnimation.setDuration(DURATION_TIME);
                mAnimation.setRepeatCount(Animation.INFINITE);
                mAnimation.setRepeatMode(Animation.REVERSE);
                mAnimation.setFillAfter(true);
                mTextView.startAnimation(mAnimation);
                break;
        }
        return true;
    }
}
