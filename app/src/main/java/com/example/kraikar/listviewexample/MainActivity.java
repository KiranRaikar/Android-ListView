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

        String[] fruits = {"Apple", "Apricot", "Avocado", "Banana", "Bilberry", "Blackberry", "Blackcurrant",
                "Blueberry", "Boysenberry", "Currant", "Cherry", "Cherimoya", "Cloudberry", "Coconut",
                "Cranberry", "Cucumber", "Custard apple", "Damson", "Date", "Dragonfruit", "Durian",
                "Elderberry", "Feijoa", "Fig", "Goji berry", "Gooseberry", "Grape", "Raisin", "Grapefruit",
                "Guava", "Honeyberry", "Huckleberry", "Jabuticaba", "Jackfruit", "Jambul", "Jujube",
                "Juniper berry", "Kiwifruit", "Kumquat", "Lemon", "Lime", "Loquat", "Longan", "Lychee",
                "Mango", "Marionberry", "Melon", "Cantaloupe", "Honeydew", "Watermelon", "Miracle fruit",
                "Mulberry", "Nectarine", "Nance", "Olive", "Orange", "Blood orange", "Clementine", "Mandarine",
                "Tangerine", "Papaya", "Passionfruit", "Peach", "Pear", "Persimmon", "Physalis", "Plantain",
                "Plum", "Prune (dried plum)", "Pineapple", "Plumcot (or Pluot)", "Pomegranate", "Pomelo",
                "Purple mangosteen", "Quince", "Raspberry", "Salmonberry", "Rambutan", "Redcurrant",
                "Salal berry", "Salak", "Satsuma", "Star fruit", "Strawberry", "Tamarillo", "Tamarind",
                "Tomato", "Ugli fruit", "Yuzu"};

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
