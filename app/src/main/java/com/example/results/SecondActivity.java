package com.example.results;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;




public class SecondActivity extends AppCompatActivity {

    private Button secondBtn;
    private EditText secondTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondBtn = findViewById(R.id.btn_send_result_back);
        secondTv = findViewById(R.id.et_enter_name);

        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendBackName();
            }
        });
    }

    private void sendBackName(){
        Intent intent = new Intent();
        intent.putExtra("result", secondTv.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
