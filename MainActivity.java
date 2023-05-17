package com.example.bwuconnect;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Objects.<ActionBar>requireNonNull(getSupportActionBar()).hide();

        Thread thread = new Thread(){

            public void run(){
                try{
                    sleep(2000);
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                    finish();
                }
            }

        };thread.start();

    }
}