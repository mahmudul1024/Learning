package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorder.Adapters.Mainadapter;
import com.example.foodorder.Models.Mainmodels;
import com.example.foodorder.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
       binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<Mainmodels>list=new ArrayList<>();

        list.add(new Mainmodels(R.drawable.bronx6,"bronx item one","5","with hot tomato sauce"));
        list.add(new Mainmodels(R.drawable.bronx8,"bronx item two","9","with extra chilli"));
        list.add(new Mainmodels(R.drawable.bronx_7,"bronx item three","8","with mild tomato sauce"));
        list.add(new Mainmodels(R.drawable.bronx_nunn,"bronx item four","3","with Butter and knoblauch"));
        list.add(new Mainmodels(R.drawable.bronxpizza,"bronx item five","8","with hot tomato and mozarella"));
        list.add(new Mainmodels(R.drawable.bronxburg,"bronx item six","12","with beef "));
        list.add(new Mainmodels(R.drawable.bronxburger,"bronx item seven","5","with hot tomato sauce special"));
        list.add(new Mainmodels(R.drawable.bronx1,"bronx item eight","7","with extra hot tomato sauce special"));
        list.add(new Mainmodels(R.drawable.bronx3,"bronx item nine","10","spicy and with cheese"));
        list.add(new Mainmodels(R.drawable.bronx8,"bronx item ten","5","bonx secret recepe"));
        list.add(new Mainmodels(R.drawable.bronx5,"bronx item eleven","12","with  special mozarella"));





        Mainadapter mainadapter=new Mainadapter(list,this);

        binding.recVIEWid.setAdapter(mainadapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);

        binding.recVIEWid.setLayoutManager(layoutManager);


    }
}