package com.example.hsenid.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText kmText = (EditText) findViewById(R.id.inputNumber);
        final EditText mileText = (EditText) findViewById(R.id.outputNumber);
        Button kmToMileBtn = (Button) findViewById(R.id.buttonKM);
        Button mileToKmBtn = (Button) findViewById(R.id.buttonMiles);
    }
}
