package com.example.toast;

import static com.example.toast.R.string.hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_toast;
    TextView txt;
    Button btn_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn_toast = findViewById(R.id.button_toast);
         txt = findViewById(R.id.show_count);
        btn_count = findViewById(R.id.button_count);

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(getApplicationContext(), hw,Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        final int[] i = {0};
        btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i[0]++;
                txt.setText(String.valueOf(i[0]));
            }
        });
    }
}