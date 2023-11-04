package com.example.bananajames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private LinearLayout textViewContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] mes = getResources().getStringArray(R.array.mes);

        textViewContainer = findViewById(R.id.textViewContainer);

        for(String m : mes) {
            addTextView(m);
        }
    }

    private void addTextView(String optionText) {
        TextView textView = new TextView(this);
        textView.setText(optionText);
        textView.setPadding(16, 16, 16, 16);
        textView.setElevation(8);
//        textView.setTextSize(16);
        textView.setOnClickListener(v -> {
            String selectedOption = ((TextView) v).getText().toString();

            Toast.makeText(MainActivity.this, selectedOption, Toast.LENGTH_SHORT).show();
        });

        textViewContainer.addView(textView);
    }
}