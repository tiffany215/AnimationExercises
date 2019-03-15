package com.example.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


/**
 * 补间动画
 */
public class TweenAnimationXmlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweem_animation_xml);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.tween_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.add_menu:

                Toast.makeText(this, "add_menu", Toast.LENGTH_SHORT).show();
                break;

            case R.id.remove_menu:
                Toast.makeText(this, "remove_menu", Toast.LENGTH_SHORT).show();
                break;

            default:
        }
        return true;
    }
}
