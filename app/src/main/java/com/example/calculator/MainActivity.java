package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private TextView result, result1;
    private Button btnClear, btn0, btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnMinus,btnMulti,btnDivide,btnOpenBracket,btnCloseBracket,btnAC,btnDot,btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        result1 = findViewById(R.id.result1);

//        btnClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                result1.setText("");
//            }
//        });

        assignId(btn0, R.id.btn0);
        assignId(btn1, R.id.btn1);
        assignId(btn2, R.id.btn2);
        assignId(btn3, R.id.btn3);
        assignId(btn4, R.id.btn4);
        assignId(btn5, R.id.btn5);
        assignId(btn6, R.id.btn6);
        assignId(btn7, R.id.btn7);
        assignId(btn8, R.id.btn8);
        assignId(btn9, R.id.btn9);
        assignId(btnAdd, R.id.btnAdd);
        assignId(btnMinus, R.id.btnMinus);
        assignId(btnMulti, R.id.btnMulti);
        assignId(btnDivide, R.id.btnDivide);
        assignId(btnOpenBracket, R.id.btnOpenBracket);
        assignId(btnCloseBracket, R.id.btnCloseBracket);
        assignId(btnAC, R.id.btnAC);
        assignId(btnDot, R.id.btnDot);
        assignId(btnEqual, R.id.btnEqual);
    }

    void assignId(Button btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }



    public void onClick(View view){
        Button btn = (Button) view;
        String btnText = btn.getText().toString();
        result1.setText(btnText);
    }
}