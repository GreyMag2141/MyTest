package ru.myfirstapp.mytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityQuestion extends AppCompatActivity {
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_question);
        button3 = (Button) findViewById(R.id.button);
        // вещаем на кнопку слушатель
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // создаем намерение, которое будет вызывать  по нажатию кнопки
                Intent intent = new Intent(MainActivityQuestion.this, MainActivityResult.class);
                startActivity(intent);
            }
        });
    }
}
