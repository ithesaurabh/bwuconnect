package com.example.bwuconnect;

import static android.net.Uri.parse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity4 extends AppCompatActivity
    {
        private Button mail;
        private Button ginsta;


        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        mail = findViewById(R.id.m1);
        ginsta = findViewById(R.id.i1);
        ginsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/kirmada.apk/");
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String address[] = {"sanga.kirmada@gmail.com"};
                composeEmail(address);
            }
        });

    }
        private void gotoUrl (String s){
        Uri uri = parse(s);
        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(intent1);

    }
        private void composeEmail (String[]address){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, address);

            startActivity(intent);

    }
    }