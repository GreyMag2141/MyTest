package ru.myfirstapp.mytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Toast;

public class MainActivityTest extends Activity{
    final String LOG_TAG = "myLogs";
    ListView listView;
    String[] names;
    private Button button5;
    int perehod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);
        button5 = (Button) findViewById(R.id.button);

        listView = findViewById(R.id.ListView);
                listView.setChoiceMode(listView.CHOICE_MODE_SINGLE);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.names,
                android.R.layout.simple_list_item_single_choice);
        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//              int position, long id) {
//                Log.d(LOG_TAG, "itemClick position = " + position + " , id = " + id);
//            }
//        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Клик № " + position, Toast.LENGTH_SHORT).show();
                perehod =   position;
//                Intent intent = new Intent(MainActivityTest.this, MainActivityQuestion.class);
//                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityTest.this, MainActivityQuestion.class);
                intent.putExtra("perehod",perehod);
                startActivity(intent);
            }
        });
    }
}

