package com.example.tweenanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startAnimation(View view) {
        startActivity(new Intent(MainActivity.this, BaseXMLTweenAnimationActivity.class));
    }

    public void startCodeAnimation(View view) {
        startActivity(new Intent(MainActivity.this, BaseCodeTweenAnimationActivity.class));
    }

    public void startInterpolatorAnimation(View view) {
        startActivity(new Intent(MainActivity.this, TweenAnimationInterpolatorActivity.class));
    }

    public void startInstanceAnimation(View view) {
        startActivity(new Intent(MainActivity.this, InstanceAnimationActivity.class));
    }
}
