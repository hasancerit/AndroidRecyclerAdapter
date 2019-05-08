package com.example.hasan.recyleview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.MyViewHolder> {
    ArrayList<User> mList;
    LayoutInflater layoutInflater;

    public CustomAdaptor(Context context,ArrayList<User> mList){
        layoutInflater = LayoutInflater.from(context);
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.satir,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdaptor.MyViewHolder holder, int position) {
        User current = mList.get(position);
        holder.setData(current);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        TextView v1,v2;

        public MyViewHolder(View v){
            super(v);
            v1 = v.findViewById(R.id.text1);
            v2 = v.findViewById(R.id.text2);
        }

        public void setData(User current){
            this.v1.setText(current.getIsim());
            this.v2.setText(current.getNumara());
        }

    }

}
