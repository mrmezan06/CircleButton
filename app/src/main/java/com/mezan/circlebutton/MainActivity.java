package com.mezan.circlebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.markushi.ui.CircleButton;

public class MainActivity extends AppCompatActivity {

    CircleButton cBtn;
    TextView TV;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cBtn = (CircleButton) findViewById(R.id.cb);
        TV = (TextView) findViewById(R.id.txt);

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val="Circle Button Pressed :"+i+" times";
                TV.setText(val);
                i++;
            }
        });

    }
}
