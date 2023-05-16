package com.example.recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private MyList[] listData;
    private Context mContext;

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data,parent);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
     holder.mtitle.setText(listData[position].getTitle());
     holder.mDesc.setText(listData[position].getDescription());
     holder.itemImage.setImageResource(listData[position].getImg());

     holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(mContext, "Click Me a", Toast.LENGTH_SHORT).show();
         }
     });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView mtitle,mDesc;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
             itemImage=itemView.findViewById(R.id.img);
             mtitle=itemView.findViewById(R.id.title);
             mDesc=itemView.findViewById(R.id.description);

        }
    }
}
