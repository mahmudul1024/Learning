package com.example.rec;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import Adapterfolder.YouAdapter;

public class MainActivity extends AppCompatActivity
{
    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv=(RecyclerView)findViewById(R.id.recViewid);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        String[] arr={"C","C++","JAVA","PHP",".NEt","JQuery","C","C++","JAVA","PHP",".NEt","JQuery","C","C++","JAVA","PHP",".NEt","JQuery"};
        rcv.setAdapter(new YouAdapter(arr));

    }


    }












