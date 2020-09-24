package com.example.ronombao_ceng319lab1_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.List;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> list = new ArrayList<>();
        list.add("AIActivity");
        list.add("VRActivity");

        //ADAPTER
        final ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        AIActivity.listView.setAdapter(adapter);
        AIActivity.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
                parent.getItemAtPosition(pos);
            }
        });

        Toast.makeText(this, "onCreate Triggered", 5).show();

    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "onStart Triggered", 5).show();
    }

    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume Triggered", 5).show();
    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart Triggered", 5).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy Triggered", 5).show();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause Triggered", 5).show();
    }
}