package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tictactoe.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainxml;
    int flag=0;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         mainxml = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainxml.getRoot());

    }

    public void Check(View view) {
        Button currentBtn = (Button) view;
        if (currentBtn.getText().toString().equals("")) {
            counter++;

            if (flag == 0) {
                currentBtn.setText("X");
                flag = 1;
            } else {
                currentBtn.setText("O");
                flag = 0;
            }

            if (counter > 4) {
                String b1 = mainxml.btn1.getText().toString();
                String b2 = mainxml.btn2.getText().toString();
                String b3 = mainxml.btn3.getText().toString();
                String b4 = mainxml.btn4.getText().toString();
                String b5 = mainxml.btn5.getText().toString();
                String b6 = mainxml.btn6.getText().toString();
                String b7 = mainxml.btn7.getText().toString();
                String b8 = mainxml.btn8.getText().toString();
                String b9 = mainxml.btn9.getText().toString();

                //condition
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    Toast.makeText(getApplicationContext(), "Winner is : "+b1, Toast.LENGTH_SHORT).show();
                    newGame();
                }else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
                    Toast.makeText(getApplicationContext(), "Winner is : "+b4, Toast.LENGTH_SHORT).show();
                    newGame();
                }else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
                    Toast.makeText(getApplicationContext(), "Winner is : "+b7, Toast.LENGTH_SHORT).show();
                    newGame();
                }else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                    Toast.makeText(getApplicationContext(), "Winner is : "+b1, Toast.LENGTH_SHORT).show();
                    newGame();
                }else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")){
                    Toast.makeText(getApplicationContext(), "Winner is : "+b2, Toast.LENGTH_SHORT).show();
                    newGame();
                }else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
                    Toast.makeText(getApplicationContext(), "Winner is : "+b3, Toast.LENGTH_SHORT).show();
                    newGame();
                }else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")){
                    Toast.makeText(getApplicationContext(), "Winner is : "+b1, Toast.LENGTH_SHORT).show();
                    newGame();
                }else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")){
                    Toast.makeText(getApplicationContext(), "Winner is : "+b3, Toast.LENGTH_SHORT).show();
                    newGame();
                }else if (counter==9){
                    Toast.makeText(getApplicationContext(), "Game is Drawn", Toast.LENGTH_SHORT).show();
                    newGame();
                }
            }
        }
    }

    public void newGame(){
        mainxml.btn1.setText("");
        mainxml.btn2.setText("");
        mainxml.btn3.setText("");
        mainxml.btn4.setText("");
        mainxml.btn5.setText("");
        mainxml.btn6.setText("");
        mainxml.btn7.setText("");
        mainxml.btn8.setText("");
        mainxml.btn9.setText("");
        counter=0;
        flag=0;
    }
}