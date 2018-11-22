package com.example.admin.upshothelloworld.activities;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class ListAdapter extends ArrayAdapter<DataModel> {
    public ListAdapter(Context context, int resource,  List<DataModel> objects) {
        super(context, resource, objects);
    }

}
