package com.example.dexecon.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class Slider extends Activity implements OnSeekBarChangeListener,
    OnClickListener {
    SeekBar sb;
    boolean flag = false;
    Button Confirm;
    TextView seekbartest;
    RelativeLayout page_background;

    TextView h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Intent intent = getIntent();
        //initialization();
       // sb.setOnSeekBarChangeListener(this);
        page_background.setOnClickListener(this);
        h=(TextView)findViewById(R.id.phoneaway);
        Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"Fox.ttf");
        h.setTypeface(myCustomFont);
    }

    private void initialization() {
        sb = (SeekBar) findViewById(R.id.myseek);
        seekbartest = (TextView) findViewById(R.id.slider_text);
        Confirm = (Button) findViewById(R.id.after_slide_button);
        page_background = (RelativeLayout) findViewById(R.id.full_page_layout);
        seekbartest.setText("... slide to use phone");

    }

    @Override
    public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
        if (arg1 > 95) {
            arg0.setThumb(getResources().getDrawable(R.drawable.slider_icon));
        }
    }
    @Override
    public void onStartTrackingTouch(SeekBar arg0) {
        seekbartest.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onStopTrackingTouch(SeekBar arg0) {
        Log.d("onStopTrackingTouch", "onStopTrackingTouch");
        if (arg0.getProgress() < 80) {
            arg0.setProgress(0);
            sb.setBackgroundResource(R.drawable.green);
            seekbartest.setVisibility(View.VISIBLE);
            seekbartest.setText("Slide to Unlock");

        } else {
            arg0.setProgress(100);
            seekbartest.setVisibility(View.VISIBLE);
            seekbartest.setText("Press to confirm");
            sb.setVisibility(View.INVISIBLE);
            Confirm.setVisibility(View.VISIBLE);

        }
    }

    @Override
    public void onClick(View view) {

        sb.setVisibility(View.VISIBLE);
        sb.setProgress(0);
        Confirm.setVisibility(View.INVISIBLE);
        sb.setBackgroundResource(R.drawable.green);
        seekbartest.setVisibility(View.VISIBLE);
        seekbartest.setText("Slide to Unlock");
    }
}