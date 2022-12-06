package com.example.ubco_community;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homePage extends AppCompatActivity {
    Button tradeb, sstudyb,ssc,map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

         tradeb = (Button) findViewById(R.id.tradeBlock);
         sstudyb = (Button)findViewById(R.id.studySpace);
         ssc = (Button)findViewById(R.id.sscPage);
         map = (Button)findViewById(R.id.ubco_map);




    }

     public void settradeBlock(View view){
         Intent intent = new Intent(this,tradeBlockMain.class);
         tradeb.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v) {
                startActivity(intent);
             }


         });
     }
    public void setSstudyb(View view){
        Intent intent = new Intent(this,studyBlockMain.class);
        tradeb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }


        });
    }
    public void setSsc(View view){
        Intent intent = new Intent(this,ssc_page.class);
        tradeb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }


        });
    }
    public void setMapet(View view){
        Intent intent = new Intent(this,map_UBCO.class);
        tradeb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }


        });
    }


}