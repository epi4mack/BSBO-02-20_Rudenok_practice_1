package ru.mirea.rudenok.task_6_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.textView);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        button1.setText("Вторая кнопка");
        button2.setText("Первая кнопка");
        CheckBox checkBox = findViewById(R.id.checkBox);

        View.OnClickListener clicked2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText("Нажата первая кнопка");
                checkBox.setChecked(true);
            }
        };

        button2.setOnClickListener(clicked2);
    }

    public void onclick (View view ) {
        Toast.makeText(this, "Нажата вторая кнопка (OnClick)", Toast.LENGTH_SHORT).show();
        CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox);
        checkbox.setChecked(false);
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("Нажата вторая кнопка (OnClick)");
    }

}