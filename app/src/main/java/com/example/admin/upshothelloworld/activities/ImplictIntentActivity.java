package com.example.admin.upshothelloworld.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.upshothelloworld.R;

public class ImplictIntentActivity extends AppCompatActivity {

    private Button mButtonOpenURL;
    private EditText mEditTextURL;
    private TextView textViewText, mTextViewLength;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implict_intent);
        mButtonOpenURL = findViewById(R.id.buttonOpenURL);
        mEditTextURL = findViewById(R.id.editTextURL);

        textViewText = findViewById(R.id.textViewText);

        mTextViewLength = findViewById(R.id.textLength);

        textViewText.setText("Text set By Ranjitha");

        textViewText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int len =   textViewText.getText().length();
              mTextViewLength.setText(""+len);
            }
        });

        mButtonOpenURL.setText("Click here to open browser");

        mButtonOpenURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareApp();
            }
        });

    }

    private void openURL() {
        String url = mEditTextURL.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www."+url));
        startActivity(intent);
    }

    private void shareApp() {
        String url = mEditTextURL.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email");
        intent.putExtra(Intent.EXTRA_TEXT,"Text");
        startActivity(Intent.createChooser(intent, "Select one App to share"));
    }
}
