package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get the button
        Button b2 = findViewById(R.id.b2);

        // Receive values from MainActivity
        Bundle extras = getIntent().getExtras();

        if (extras != null) {

            String value1 = extras.getString("Value1");
            String value2 = extras.getString("Value2");

            int a = Integer.parseInt(value1);
            int b = Integer.parseInt(value2);

            int c = a + b;

            Toast.makeText(
                    SecondActivity.this,
                    "Addition is: " + c,
                    Toast.LENGTH_LONG
            ).show();
        }

        // Navigate back to MainActivity
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(
                        SecondActivity.this,
                        MainActivity.class
                );

                startActivity(i);
            }
        });
    }
}
