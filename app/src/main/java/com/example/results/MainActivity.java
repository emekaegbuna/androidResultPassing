package com.example.results;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import java.nio.Buffer;

public class MainActivity extends AppCompatActivity {

    private TextView tvresult;
    private Button FirstBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstBtn = findViewById(R.id.to_second);
        tvresult = findViewById(R.id.textView);


        FirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent, 1);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1){
            if(resultCode==RESULT_OK){
                String newData = data.getStringExtra("result");
                tvresult.setText(newData);
            }
            if(resultCode==RESULT_CANCELED){
                //handle case
            }
        }
    }
}
