package com.example.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class CodeFrameAnimationActivity extends AppCompatActivity {

    private ImageView mImageView;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_frame_animation);
        mImageView = findViewById(R.id.imageView2);
        animationDrawable = initAnimation();
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

    private AnimationDrawable initAnimation() {
        final AnimationDrawable animationDrawable = new AnimationDrawable();
        for (int i = 1; i < 75; i++) {
            int id =  getResources().getIdentifier("timg_"+ i,"drawable",getPackageName());
            Drawable drawable = getResources().getDrawable(id);
            animationDrawable.addFrame(drawable,60);
        }
        animationDrawable.setOneShot(false);
        mImageView.setImageDrawable(animationDrawable);
        animationDrawable.start();
        return animationDrawable;
    }
}
