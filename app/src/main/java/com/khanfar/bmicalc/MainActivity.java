package com.khanfar.bmicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText weight , height ;
private Button calc ;
private Switch gender ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpTheComponent() ;
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h = Double.parseDouble(height.getText().toString()) ;
                double w = Double.parseDouble(weight.getText().toString())  ;
                double bmi = w / Math.pow(h ,2) ;
                if (gender.isChecked()){
                    bmi = bmi + (bmi * 0.05) ;
                }
                Toast.makeText(MainActivity.this , "BMI IS : "+ bmi  , Toast.LENGTH_SHORT) .show();
            }
        });
    }

    private void setUpTheComponent() {
        weight = findViewById(R.id.Weight ) ;
        height = findViewById(R.id.height ) ;
        calc = findViewById(R.id.calc) ;
        gender = findViewById(R.id.gender) ;
    }


}