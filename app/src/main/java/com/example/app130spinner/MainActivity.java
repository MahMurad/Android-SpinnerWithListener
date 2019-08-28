package com.example.app130spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private String [] countryNames;
    private ImageButton imageButton;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryNames = getResources().getStringArray(R.array.listItem);

        spinner = (Spinner) findViewById(R.id.spinnerId);
        imageButton = (ImageButton) findViewById(R.id.imageButtonId);
        textView = (TextView) findViewById(R.id.textViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.adapter_layout,R.id.adapterTextViewId,countryNames);
        spinner.setAdapter(adapter);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = spinner.getSelectedItem().toString();
                textView.setText(value);
            }
        });
    }
}
