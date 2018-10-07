package com.herokuapp.abedyngash.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;
    Button clickMeButton;
    TextView displayGreetings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.name);
        clickMeButton = findViewById(R.id.button);
        displayGreetings = findViewById(R.id.textName);

        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myname = nameEditText.getText().toString().trim();
                if (!myname.isEmpty()){
                    //Read the name
                    displayGreetings.setText("Hello: " + myname);
                    Intent home = new Intent(MainActivity.this, HomeActivity.class);
                    home.putExtra("jina", myname);
                    startActivity(home);
                }
                else {
                    nameEditText.setError("Please enter your name");
                    nameEditText.requestFocus();
                    return;
                }
            }
        });
    }
}
