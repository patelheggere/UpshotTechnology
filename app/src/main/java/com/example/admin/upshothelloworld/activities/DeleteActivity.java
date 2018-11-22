package com.example.admin.upshothelloworld.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.admin.upshothelloworld.R;

public class DeleteActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    DBManager dbManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        editText = findViewById(R.id.phone);
        button = findViewById(R.id.delete);
        dbManager = new DBManager(this);
        dbManager.open();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button");
                long ret = dbManager.delete(editText.getText().toString());
                Log.d("", "Deleted:: "+ret);
            }
        });
    }
}
