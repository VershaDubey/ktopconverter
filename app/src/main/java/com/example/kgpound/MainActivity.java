package com.example.kgpound;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView;
private EditText editTexttext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView =  findViewById(R.id.textView);
        editTexttext =  findViewById(R.id.editTexttext);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
          String s = editTexttext.getText().toString();
          int kg = Integer.parseInt(s);
          double pound = 2.205 * kg;
          textView.setText("The corresponding value in pounds is " + pound);

             }
         });

    }

}