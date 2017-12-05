package com.example.rebor.dasd;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button admin;

    ListView listView;

    ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        admin = (Button) findViewById(R.id.adminBtn);

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.activity_login, null);

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("관리자 키를 입력하시오.");
                dialog.setView(layout);

                final EditText etKey = (EditText) layout.findViewById(R.id.etKey);

                dialog.setPositiveButton("로그인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //관리자키 asdfqwer1234 가정
                        if(etKey.getText().toString().equals("asdfqwer1234")) {
                            dialog.dismiss();
                            moveAdmin();
                        } else {
                            Toast.makeText(getBaseContext(), "올바른 입력인지 확인하세요.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                dialog.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                dialog.create();
                dialog.show();
            }
        });

        items= new ArrayList<Item>();


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

    public void moveAdmin() {
        Intent intent = new Intent(this, AdminActivity.class);
        startActivity(intent);
    }
}
