package com.example.tweenanimation;

import android.content.Intent;
import android.service.autofill.TextValueSanitizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Animation mAnimation;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text_content);

        mAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animtion);
    }

    public void startAnimation(View view) {
//        mTextView.startAnimation(mAnimation);
        startActivity(new Intent(this, TweenAnimationXmlActivity.class));
    }

    public void cancelAnimation(View view) {
        mTextView.clearAnimation();
    }
}
