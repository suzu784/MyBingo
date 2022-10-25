package com.example.mybingo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

        // 最大値の初期値をEditTextにセットする
        maxNumberEditText.setText("" + maxNumber);

        // 最大値を更新する
        registerMaxNumberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 入力値を最大値で取り出す
                String maxNumberString = maxNumberEditText.getText().toString();
                // int型に変換してから代入する
                maxNumber = Integer.valueOf(maxNumberString);

                Log.d("MainActivity", "maxNumber:" + maxNumber);
            }
        });


    }
}