package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private Button trueButton;
    private Button falseButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        trueButton = (Button)findViewById(R.id.trueButton);
        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast =  Toast.makeText(MyActivity.this, R.string.correct_toast, Toast.LENGTH_LONG);
                toast.show();
            }
        });
        falseButton = (Button)findViewById(R.id.falseButton);
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MyActivity.this,R.string.incorrect_toase,Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
