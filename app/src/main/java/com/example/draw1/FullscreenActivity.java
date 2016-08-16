package com.example.draw1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class FullscreenActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        FrameLayout layout = (FrameLayout) findViewById(R.id.fm);
        layout.addView(new Draw_line(getApplicationContext()));
    }
}

