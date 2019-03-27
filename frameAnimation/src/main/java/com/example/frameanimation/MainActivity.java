package com.example.frameanimation;

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

    public void codeFrameAnim(View view) {
        startActivity(new Intent(this,CodeFrameAnimationActivity.class));
    }

    public void xmlFrameAnim(View view) {
        startActivity(new Intent(this,XmlFrameAnimationActivity.class));
    }
}
