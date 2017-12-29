package com.example.sharadsingh.deeplinkingviewexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sharadsingh on 29/12/17.
 */

public class NextActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text);
        Intent intent = getIntent();
        if(intent!=null){
            String action = intent.getAction();
            Uri data = intent.getData();
            textView.setText(data.toString());
            Toast.makeText(this, data.toString(), Toast.LENGTH_SHORT).show();
        }

    }
}
