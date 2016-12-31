package com.example.kraikar.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] fruits = {"Apple", "banana", "Grapes", "Mango", "Pineapple", "Pomegranate", "Guava", "Orange", "Avocado", "Kiwi"};

        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits);
        ListView listViewFruits = (ListView) findViewById(R.id.listViewFruits);
        listViewFruits.setAdapter(listAdapter);

        listViewFruits.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String fruit = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, fruit, Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
