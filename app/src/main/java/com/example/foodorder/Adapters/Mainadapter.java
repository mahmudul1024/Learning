package com.example.foodorder.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorder.Models.Mainmodels;
import com.example.foodorder.R;

import java.sql.Ref;
import java.util.ArrayList;

public class Mainadapter extends RecyclerView.Adapter<Mainadapter.viewholder>{

    ArrayList <Mainmodels> list;
    Context context;

    public Mainadapter(ArrayList<Mainmodels> list, Context context){
        this.list=list;
        this.context=context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
   View view=LayoutInflater.from(context).inflate(R.layout.sample_food,parent,false);
   return  new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position){

        final  Mainmodels mainmodels=list.get(position);
        holder.foodimage.setImageResource(mainmodels.getImaage());
        holder.mainname.setText(mainmodels.getName());
        holder.price.setText(mainmodels.getPrice());
        holder.description.setText(mainmodels.getDescription());



    }

    @Override
    public int getItemCount(){
        return list.size();
    }

    public  class viewholder extends RecyclerView.ViewHolder
    {
        ImageView foodimage;
        TextView mainname, price, description;

        public viewholder(@NonNull View itemView){
            super(itemView);

            foodimage=itemView.findViewById(R.id.img1);
            mainname=itemView.findViewById(R.id.nameid);
            price=itemView.findViewById(R.id.priceid);
            description=itemView.findViewById(R.id.descriptionid);


        }
    }


}