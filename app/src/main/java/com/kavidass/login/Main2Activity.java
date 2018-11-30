package com.kavidass.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    Spinner dropdown = findViewById(R.id.EDU_spinner);
    String[] items = new String[]{"PhD", "ME", "BE" , " Any Bachelor's Degree" , "Any Master's Degree" , "NetWorking Engineer" , "System Engineer", "System support Engineer",  "Hardware and Networking"};
    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
    dropdown.setAdapter(adapter);

}
