package com.example.dialoguefragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        button = findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                MyDialogFragment dialog =
                        new MyDialogFragment();

                dialog.show(
                        getSupportFragmentManager(),
                        "MyFragment"
                );
            }
        });
    }
}
