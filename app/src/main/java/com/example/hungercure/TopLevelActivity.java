package com.example.hungercure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {

                if(position == 0){

 //                   Intent intent = new Intent(TopLevelActivity.this, FoodCategoryActivity.class);
 //                   startActivity(intent);
                }
            }
        };
    }
}