package com.example.recycler_view;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView {
    private MyList[] listData;
    public MyAdapter(@NonNull Context context) {
        super(context);
    }
}
