package com.example.admin.upshothelloworld.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.upshothelloworld.R;

public class HelloWorldActivity extends AppCompatActivity {

    private static final String TAG = "HelloWorldActivity";
    private TextView textView;
    private Button mButtonNext;
    private EditText mEditTextName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sctivity_one_layout);
        mEditTextName = findViewById(R.id.tv_text1);

        mButtonNext = findViewById(R.id.buttonSubmit);

        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextScreen();
            }
        });
        System.out.println("Oncreate");
    }

    private void nextScreen() {
        Intent intentNextScreen = new Intent(HelloWorldActivity.this, SecondActivity.class);
        String name= mEditTextName.getText().toString();
        if(name==null || name.isEmpty())
        {
            mEditTextName.setError("Please Enter Some text");
            return;
        }
        intentNextScreen.putExtra("NAME", name );
        startActivity(intentNextScreen);

    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: ");
        System.out.println("onPuase");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: ");
        System.out.println("onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: ");
        System.out.println("onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: ");
        System.out.println("onStop");
        super.onStop();
    }
    

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        System.out.println("onDestroy");
        super.onDestroy();
    }
}
    
