package com.example.vloumeboom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView=null;
    RecyclerViewAdapter recyclerViewAdapter=null;
    ArrayList<Data> mList;
    private String mTitle; //리사이클러뷰의 제목

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview_list);
        mList = new ArrayList<>();

        recyclerViewAdapter = new RecyclerViewAdapter(mList); //리스트 장착
        recyclerView.setAdapter(recyclerViewAdapter); //어댑터 장착
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)); //가로방향스크롤,

        mTitle = "test";

        addItem(mTitle + "1");
        addItem(mTitle + "2");
        addItem(mTitle + "3");
        addItem(mTitle + "4");

        recyclerViewAdapter.notifyDataSetChanged();


    }

    private void addItem(String title) { //타이틀, 그리드뷰 들어가야함
        Data item = new Data();

        item.setTitle(title);
    }
}