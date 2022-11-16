package com.example.practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class home_activity extends AppCompatActivity {
    private ListView listview ;
    private com.example.practice.ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Adapter 생성
        adapter = new com.example.practice.ListViewAdapter();

        // 리스트뷰 참조 및 Adapter 달기
        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(adapter);
        //listview.setOnItemClickListener(listener);

        adapter.addItem("제목1", R.drawable.test, "내용1");  //(제목 부분, 이미지, 내용)
        adapter.addItem("제목2", R.drawable.test, "내용2");
        adapter.addItem("제목3", R.drawable.test, "내용3");
        adapter.addItem("제목4", R.drawable.test, "내용4");
        adapter.addItem("제목5", R.drawable.test, "내용5");
        adapter.addItem("제목6", R.drawable.test, "내용6");
        adapter.addItem("제목7", R.drawable.test, "내용7");
        adapter.addItem("제목8", R.drawable.test, "내용8");
        adapter.addItem("제목9", R.drawable.test, "내용9");


        adapter.notifyDataSetChanged(); //어댑터의 변경을 알림.

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent =  new Intent(home_activity.this , info_activity.class); //위치지정
                startActivity(intent); //액티비티 이동
            }
        });


    }
}
