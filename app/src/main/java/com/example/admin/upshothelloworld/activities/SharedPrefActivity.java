package com.example.admin.upshothelloworld.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.upshothelloworld.R;

public class SharedPrefActivity extends AppCompatActivity {

    private static final String TAG = "SharedPrefActivity";
    private Button buttonSave, buttonFetch;
    private TextView textViewName;
    private EditText editTextName;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);
        editTextName = findViewById(R.id.editTextName);
        textViewName = findViewById(R.id.textViewFetched);
        buttonSave = findViewById(R.id.buttonSave);
        buttonFetch = findViewById(R.id.buttonFetch);

        sharedPreferences = getSharedPreferences("UPSHOT", Context.MODE_PRIVATE);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("NAME", editTextName.getText().toString());
                editor.apply();
                editTextName.setText("");
            }
        });

        buttonFetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = sharedPreferences.getString("NAME", null);
                textViewName.setText(name);
            }
        });
        //adding comment

    }
}
