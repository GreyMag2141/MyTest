package ru.myfirstapp.mytest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityTest extends AppCompatActivity {
    String[] tests;
    ArrayAdapter<String> adapter;
    ListView listView;
    private Button button5;
    int select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);

        button5 = (Button) findViewById(R.id.button5);
        listView = findViewById(R.id.ListView);

        tests = new String[]{"Java", "Android", "Windows"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, tests);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick (AdapterView<?> parent, View itemClicked, int position, long id) {
                Toast.makeText(getApplicationContext(), ((TextView) itemClicked).getText(), Toast.LENGTH_SHORT).show();

                select =   position;
//                Intent intent = new Intent(MainActivityTest.this, MainActivityQuestion.class);
//                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityTest.this, MainActivityQuestion.class);
                intent.putExtra("position",select);
                startActivity(intent);
            }
        });
    }
}

