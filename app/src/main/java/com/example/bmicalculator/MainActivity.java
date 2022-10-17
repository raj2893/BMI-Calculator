package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText mass = (EditText) findViewById(R.id.mass);
        EditText height = (EditText) findViewById(R.id.height);
        Button result = (Button) findViewById(R.id.result);
        TextView showme = (TextView) findViewById(R.id.showme);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String m =mass.getText().toString();
                 double mass_obtain = Double.parseDouble(m);

                 String h = height.getText().toString();
                 double height_obtain = Double.parseDouble(h);

                 double bmi = mass_obtain/(height_obtain*height_obtain);

                 showme.setText(String.format("Your BMI is:\n%.2f", bmi));

                 mass.setText("");
                 height.setText("");


            }
        });
    }
}