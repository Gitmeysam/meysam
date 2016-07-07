package com.example.meysam95.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by KK on 7/7/2016.
 */
public class Sample extends Activity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample);
        textView= (TextView) findViewById(R.id.texSample);
        textView.setText("This Activity Is Sample.");
    }
}
