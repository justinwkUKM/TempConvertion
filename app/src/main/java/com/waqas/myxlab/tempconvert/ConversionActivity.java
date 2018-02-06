package com.waqas.myxlab.tempconvert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class ConversionActivity extends AppCompatActivity {

    EditText etF;
    Button btConvert;
    Button btNext;
    TextView tvC;
    String s;
    double fehrenheit;
    double celcius;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        etF = (EditText) findViewById(R.id.editTextFehrenheit);
        btConvert = (Button) findViewById(R.id.buttonConvert);
        tvC = (TextView) findViewById(R.id.textViewCelsius);
        btNext = (Button) findViewById(R.id.buttonNext);

        btConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s= etF.getText().toString();
                fehrenheit = Double.parseDouble(s);
                celcius = (fehrenheit-32)*(0.5556);
                Log.e("Clicked","I CLicked" + s );
                DecimalFormat df = new DecimalFormat("###.##");
                //String finalCelcius = String.valueOf(celcius);
                double rounded  = Double.parseDouble(df.format(celcius));
                tvC.setText(rounded + " " +(char)186 + "C");
                Toast.makeText(ConversionActivity.this, "Conversion Complete", Toast.LENGTH_SHORT).show();
            }
        });
            btNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(ConversionActivity.this, NextActivity.class);
                    startActivity(i);
                }
            });
















    }
}







