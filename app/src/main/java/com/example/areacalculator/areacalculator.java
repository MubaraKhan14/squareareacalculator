package com.example.areacalculator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class areacalculator extends AppCompatActivity {

    Button btnClear, btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_calculator);

        btnClear = findViewById(R.id.btnClear);
        btnCalc = findViewById(R.id.btnCalc);

        // Add_button add clicklistener
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((EditText) findViewById(R.id.inputS)).setText("");
                ((EditText) findViewById(R.id.resultA)).setText("");
            }
        });

        // Add_button add clicklistener
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText inputS = findViewById(R.id.inputS);
                EditText result_num = findViewById(R.id.resultA);

                Double num = Double.valueOf(Double.parseDouble(inputS.getText().toString()));
                result_num.setText(String.format("%.2f", Double.valueOf(num.doubleValue() * num.doubleValue())));

                //resultA.setText("");

                hideKeyboard();
            }
        });
    }

    public void hideKeyboard() {
        ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(findViewById(R.id.mainLayout).getWindowToken(), 0);
    }
}