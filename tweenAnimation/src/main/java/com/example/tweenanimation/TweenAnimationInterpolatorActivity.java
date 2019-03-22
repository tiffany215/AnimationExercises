package com.example.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

/**
 * 补间动画差值器使用
 */
public class TweenAnimationInterpolatorActivity extends AppCompatActivity {
    private Animation mAnimation;
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation_interpolator);
        mTextView = findViewById(R.id.textView);
        initTranslateAnimation();
    }

    /**
     * 初始化平移动画
     * @return
     */
    private Animation initTranslateAnimation() {
        mAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT,0f,
                Animation.RELATIVE_TO_PARENT,0f,
                Animation.RELATIVE_TO_PARENT,0f,
                Animation.RELATIVE_TO_PARENT,0.2f);
        mAnimation.setDuration(3000);
        mAnimation.setFillAfter(true);
        mAnimation.setRepeatMode(Animation.REVERSE);
        mAnimation.setRepeatCount(Animation.INFINITE);
        return mAnimation;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_animation_interpolator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        mAnimation = null;
        initTranslateAnimation();
        switch (item.getItemId()) {
            case R.id.accelerate_decelerate_interpolator:
                mAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                break;
            case R.id.accelerate_interpolator:
                mAnimation.setInterpolator(new AccelerateInterpolator());
                break;
            case R.id.decelerate_interpolator:
                mAnimation.setInterpolator(new DecelerateInterpolator());
                break;
            case R.id.anticipate_overshoot_interpolator:
                mAnimation.setInterpolator(new AnticipateOvershootInterpolator());
                break;
            case R.id.anticipate_interpolator:
                mAnimation.setInterpolator(new AnticipateInterpolator());
                break;
            case R.id.overshoot_interpolator:
                mAnimation.setInterpolator(new OvershootInterpolator());
                break;
            case R.id.bounce_interpolator:
                mAnimation.setInterpolator(new BounceInterpolator());
                break;
            case R.id.cycle_interpolator:
                mAnimation.setInterpolator(new CycleInterpolator(1));
                break;
        }
        if(null != mAnimation){
            mTextView.startAnimation(mAnimation);
        }
        return true;
    }
}
