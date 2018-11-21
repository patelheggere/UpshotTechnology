package com.example.admin.upshothelloworld.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.admin.upshothelloworld.R;

public class SQLiteActivity extends AppCompatActivity {

    private static final String TAG = "SQLiteActivity";
    EditText name, phone, email;
    Button btn;
    DBManager dbManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.mobile);
        email = findViewById(R.id.email);
        btn = findViewById(R.id.save);
        dbManager = new DBManager(this);
        dbManager.open();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               long id =  dbManager.insert(name.getText().toString(), phone.getText().toString(), email.getText().toString());
                Log.d(TAG, "onClick: inserted ID :"+id);
            }
        });
    }
}
