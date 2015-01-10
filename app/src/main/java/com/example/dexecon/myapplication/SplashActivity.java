package com.example.dexecon.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SplashActivity extends Activity {

    TextView J;
    TextView B;
    TextView W;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        J=(TextView)findViewById(R.id.my_text);
        B=(TextView)findViewById(R.id.my_text2);
        W=(TextView)findViewById(R.id.my_text3);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"Fox.ttf");
        J.setTypeface(myCustomFont);
        B.setTypeface(myCustomFont);
        W.setTypeface(myCustomFont);

        int myTimer = 3000;
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish(); // close this activity
            }
        }, myTimer);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
