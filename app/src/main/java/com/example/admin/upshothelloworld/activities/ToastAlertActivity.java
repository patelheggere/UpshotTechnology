package com.example.admin.upshothelloworld.activities;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.upshothelloworld.R;

public class ToastAlertActivity extends AppCompatActivity {

    EditText editText;
    Button button, alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_alert);
        editText = findViewById(R.id.editTextName);
        button = findViewById(R.id.buttonSubmit);
        alert = findViewById(R.id.alert);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ToastAlertActivity.this, "You have Entered :"+editText.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlert();
            }
        });
    }

    private void showAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(ToastAlertActivity.this, "Clicked on Ok ", Toast.LENGTH_LONG);
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(ToastAlertActivity.this, "Clicked on Cancel ", Toast.LENGTH_LONG);
            }
        });

        builder.setMessage("Alert Dialog Displaying");
        builder.setTitle("Title");

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
