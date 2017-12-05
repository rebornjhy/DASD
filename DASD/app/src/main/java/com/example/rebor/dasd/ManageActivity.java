package com.example.rebor.dasd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ReBor on 2017-12-04.
 */

public class ManageActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);

        items = new ArrayList<Item>();

        items.add(new Item(1,"토스트", 1000, "ㅁㄴㅇㄹ1"));
        items.add(new Item(2,"김밥", 1500, "ㅁㄴㅇㄹ2"));
        items.add(new Item(3,"라면", 2000, "ㅁㄴㅇㄹ3"));
        items.add(new Item(4,"볶음밥", 2500, "ㅁㄴㅇㄹ4"));
        items.add(new Item(5,"국밥", 3000, "ㅁㄴㅇㄹ5"));
        items.add(new Item(6,"오므라이스", 3500, "ㅁㄴㅇㄹ6"));
        items.add(new Item(7,"한정식", 4000, "ㅁㄴㅇㄹ7"));
        items.add(new Item(8,"햄버거", 4500, "ㅁㄴㅇㄹ8"));
        items.add(new Item(9,"피자", 5000, "ㅁㄴㅇㄹ9"));

        listView = (ListView) findViewById(R.id.menuList);

        Adapter adapter = new Adapter(getApplicationContext(), R.layout.activity_item, items);

        listView.setAdapter(adapter);
    }

    public void exitActivity() {
        Intent intent = new Intent(this, AdminActivity.class);
        startActivity(intent);
    }
}
