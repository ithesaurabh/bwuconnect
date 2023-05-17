package com.example.bwuconnect;

import static android.net.Uri.parse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button logo,about,insta,linkedin,twitter,flickr,facebook,youtube,gmail,library,studentforum,calender,contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        logo = findViewById(R.id.logo);
        about = findViewById(R.id.about);
        insta = findViewById(R.id.insta);
        linkedin = findViewById(R.id.linkedin);
        twitter = findViewById(R.id.twitter);
        flickr = findViewById(R.id.flickr);
        facebook = findViewById(R.id.facebook);
        youtube = findViewById(R.id.youtube);

        gmail = findViewById(R.id.gmail);
        library = findViewById(R.id.library);
        studentforum = findViewById(R.id.studenforum);

        calender = findViewById(R.id.calender);
        contacts = findViewById(R.id.holyday);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.brainwareuniversity.ac.in/");
            }
        });

        //social
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://instagram.com/brainware_university_kolkata?igshid=YmMyMTA2M2Y=");
            }
        });
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gotoUrl("https://www.linkedin.com/school/brainwareuniversity/");
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/BrainwareTweet?t=zONHEloaLH3M56ekiKmgjA&s=09");
            }
        });
        flickr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.flickr.com/photos/brainwareindia/albums/");
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.facebook.com/brainwareuniversity");
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://youtube.com/@BrainwareUniversityKolkata");
            }
        });

        //study
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://mail.google.com/mail/u/0/#inbox");
            }
        });
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("http://bwu-opac.blacloud.in/");
            }
        });

        studentforum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.brainwareuniversity.ac.in/studentselfservice/");
            }
        });
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.brainwareuniversity.ac.in/holiday.php");
            }
        });
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.brainwareuniversity.ac.in/academic-calendar.php");
            }
        });


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = parse(s);
        Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(intent1);}

}