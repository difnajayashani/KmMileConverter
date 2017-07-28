package com.example.hsenid.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = (EditText) findViewById(R.id.inputNumber);
        final EditText output = (EditText) findViewById(R.id.outputNumber);
        Button miles2km = (Button) findViewById(R.id.miles2km);
        Button km2miles = (Button) findViewById(R.id.km2miles);


        km2miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String km = input.getText().toString();
                if (!km.matches("")){
                    float kmCount = Float.parseFloat(km);
                    output.setText( Double.toString((kmCount* 0.621371)));
                }
            }
        });

        miles2km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String miles = input.getText().toString();
                if (!miles.matches("")){
                    float mileCount = Float.parseFloat(miles);
                    output.setText( Double.toString((mileCount* 1.60934)));
                }
            }
        });








    }
}
