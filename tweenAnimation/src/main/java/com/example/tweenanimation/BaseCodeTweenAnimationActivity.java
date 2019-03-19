package com.example.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class BaseCodeTweenAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_code_tween_animation);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.base_animtion_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.alpha_animation:
                break;

            case R.id.scale_animation:
                break;

            case R.id.rotate_animation:
                break;

            case R.id.set_animation:
                break;

            case R.id.translate_animation:
                break;
        }
        return true;
    }
}
