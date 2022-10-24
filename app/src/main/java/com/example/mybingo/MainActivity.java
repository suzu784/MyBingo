package com.example.mybingo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // 最大値75
    private int maxNumber = 75;

    // 最大値の入力欄
    private EditText maxNumberEditText;

    // 最大値の設定ボタン
    private Button registerMaxNumberButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ビューの変数を初期化する
        maxNumberEditText = findViewById(R.id.max_number);

        registerMaxNumberButton = findViewById(R.id.register_max_number);

        Log.d("MainActivity", "maxNumber:" + maxNumber);
    }
}