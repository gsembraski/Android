package com.example.geovana.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    private Button btnoi;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text_1) ;

        btnoi = (Button) findViewById(R.id.btn_oi);
        btnoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("I'm here!");
            }
        });
    }
}
