package com.example.admin.upshothelloworld.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.upshothelloworld.R;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    private String mName;
    private TextView mTextViewName;
    private Button mButtonImplicit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mName = getIntent().getStringExtra("NAME");
        mTextViewName = findViewById(R.id.textView);

        mButtonImplicit = findViewById(R.id.buttonImplicitIntent);

        if(mName!=null)
        mTextViewName.setText(mName);

        mButtonImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ImplictIntentActivity.class);
                startActivity(intent);

            }
        });

        System.out.println("Oncreate");
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
