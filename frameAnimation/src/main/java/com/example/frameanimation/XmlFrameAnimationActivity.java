package com.example.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class XmlFrameAnimationActivity extends AppCompatActivity {

    private ImageView mImageView;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml_frame_animation);
        mImageView = findViewById(R.id.imageView);
        animationDrawable = (AnimationDrawable) mImageView.getDrawable();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_frame_anim,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.start_frame_anim:
                animationDrawable.start();
                break;
            case R.id.stop_frame_anim:
                animationDrawable.stop();
                break;
        }
        return true;
    }
}
