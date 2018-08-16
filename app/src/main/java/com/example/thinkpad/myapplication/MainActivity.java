package com.example.thinkpad.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnconvert;
    private TextView tvresult;
    private EditText etinputval;
    private CheckBox cbcm2m,cbm2cm,cbc2f,cbf2c,cbf2i,cbi2f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnconvert = findViewById(R.id.convert);
        tvresult = findViewById(R.id.result);
        etinputval = findViewById(R.id.inputval);
        cbcm2m = findViewById(R.id.cm2m);
        cbm2cm = findViewById(R.id.m2cm);
        cbc2f = findViewById(R.id.c2f);
        cbf2c = findViewById(R.id.f2c);
        cbf2i = findViewById(R.id.f2i);
        cbi2f = findViewById(R.id.i2f);

        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = etinputval.getText().toString();
                Double a1 = Double.parseDouble(a);


                Double ans1=null;
                Double ans2=null;
                Double ans3=null;
                Double ans4=null;
                Double ans5=null;
                Double ans6=null;
                if (cbcm2m.isChecked()){
                    ans1=a1/100;
                }
                if(cbm2cm.isChecked()){
                    ans2=a1*100;
                }
                if(cbc2f.isChecked()){
                    ans3=((a1-32)/9)*5;
                }
                if (cbf2c.isChecked()){
                    ans4=((a1/5)*9)+32;
                }
                if (cbf2i.isChecked()){
                    ans5=a1*12;
                }
                if (cbi2f.isChecked()){
                    ans6=a1/12;
                }

                tvresult.setText(" cm to m " +ans1+ "\nm to cm " + ans2+ "\ncelsius to fahrenheit " +ans3+ "\nfahrenheit to celsius "+ans4+"\nfoot to inch "+ans5+"\ninch to foot "+ans6);

            }
        });


    }
}

