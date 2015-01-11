package com.example.dexecon.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    TextView a;
    TextView b;
    TextView c;
    Button d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(TextView)findViewById(R.id.phoneaway);
        b=(TextView)findViewById(R.id.away);
        c=(TextView)findViewById(R.id.question);
        d=(Button)findViewById(R.id.button);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"Fox.ttf");
        a.setTypeface(myCustomFont);
        b.setTypeface(myCustomFont);
        c.setTypeface(myCustomFont);
        Typeface myCustomFon2= Typeface.createFromAsset(getAssets(), "Lobster.otf");
        d.setTypeface(myCustomFon2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void yes (View view){
        Intent intent= new Intent(this, Slider.class );
        startActivity(intent);
    }
}
