package com.example.admin.upshothelloworld.activities;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.upshothelloworld.DBHelper;
import com.example.admin.upshothelloworld.R;

public class FetchActivity extends AppCompatActivity {

    Button fetchButton;
    DBManager dbManager;
    Cursor cursor;
    String str="";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch);
        fetchButton = findViewById(R.id.btnFetch);
        dbManager = new DBManager(this);
        dbManager.open();
        textView = findViewById(R.id.text);
        fetchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cursor = dbManager.fetch();

                if(cursor!=null)
                {
                    do{
                        str+=cursor.getString(cursor.getColumnIndex(DBHelper.NAME))+" "+cursor.getString(cursor.getColumnIndex(DBHelper.PHONE))+" "+cursor.getString(cursor.getColumnIndex(DBHelper.EMAIL))+"\n";
                    }while (cursor.moveToNext());
                }

                textView.setText(str);
            }
        });
    }
}
