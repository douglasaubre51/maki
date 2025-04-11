package com.forge.maki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;

import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //load layout file in res
        setContentView(R.layout.activity_main);
        // logic
        Button submitBtn = findViewById(R.id.submitBtn);
        EditText nameBox = findViewById(R.id.nameBox);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on btn click logic
                String text = "welcome to android world user - " + nameBox.getText().toString();

                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
