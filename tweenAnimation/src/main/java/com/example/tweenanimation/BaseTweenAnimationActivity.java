package com.example.tweenanimation;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class BaseTweenAnimationActivity extends AppCompatActivity {

    private Context mContext;

    private Animation mAnimation;

    private TextView viewContent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_tween_animation);
        this.mContext = BaseTweenAnimationActivity.this;
        viewContent = findViewById(R.id.textView);

    }

    private Animation doAnimation(int resourceId) {
        mAnimation = AnimationUtils.loadAnimation(mContext, resourceId);
        return mAnimation;
    }


    private void startAnimation() {
        viewContent.startAnimation(mAnimation);
    }


    private void cancle() {
        viewContent.clearAnimation();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.base_animtion_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.alpha_animation:
                doAnimation(R.anim.alpha_animation);
                startAnimation();
                break;

            case R.id.scale_animation:
                doAnimation(R.anim.scale_animation);
                startAnimation();
                break;

            case R.id.translate_animation:
                doAnimation(R.anim.translate_animation);
                startAnimation();
                break;

            case R.id.rotate_animation:
                doAnimation(R.anim.rotate_animation);
                startAnimation();
                break;

            case R.id.set_animation:
                doAnimation(R.anim.set_animation);
                startAnimation();
                break;
        }
        return true;
    }
}
