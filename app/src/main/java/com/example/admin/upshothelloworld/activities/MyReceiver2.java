package com.example.admin.upshothelloworld.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver2 extends BroadcastReceiver {
    private static final String TAG = "MyReceiver2";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        Log.d(TAG, "onReceive: on reciver 2");
    }
}
