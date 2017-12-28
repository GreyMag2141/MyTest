package ru.myfirstapp.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivityTest extends AppCompatActivity {
String[] tests;
ArrayAdapter<String> adapter;
ListView ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);

        ListView = findViewById(R.id.ListView);
        tests  = new String[] { "Тест 1", "Тест 2", "Тест 3" };
        adapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tests);
        ListView.setAdapter(adapter);


    }
}
