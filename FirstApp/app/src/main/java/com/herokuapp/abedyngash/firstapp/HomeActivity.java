package com.herokuapp.abedyngash.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcome = findViewById(R.id.homeText);
        String name = getIntent().getStringExtra("jina");
        welcome.setText("Welcome home " + name);

    }
}
