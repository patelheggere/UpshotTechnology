package com.example.admin.upshothelloworld.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class MyReceiver extends BroadcastReceiver {

    private static final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: on reciever1 ");
       Intent intent1 = new Intent(context, SharedPrefActivity.class);
       intent1.setFlags(FLAG_ACTIVITY_NEW_TASK);
       context.startActivity(intent1);
    }
}
