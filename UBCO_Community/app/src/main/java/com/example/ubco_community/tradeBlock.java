package com.example.ubco_community;

import static com.example.ubco_community.R.id.acceptButton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TableRow;

import java.util.ArrayList;

public class tradeBlock extends AppCompatActivity {
    public static ArrayList<String> data = new ArrayList<String>();
    EditText course1, course2;
    ListView show;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trade_block);
        course1 = (EditText) findViewById((R.id.courseGive));
        course2 = (EditText) findViewById(R.id.courseWant);
        b = (Button)findViewById(R.id.acceptButton);





    }
}

