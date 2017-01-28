package com.familyapp.mdazizulhakim.myfavouritesite;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnBlog,btnSocial,btnGame,btnEdu,btnAbout;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        actionBar.setTitle("WebSite Catagories");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.GREEN));

        btnBlog = (Button) findViewById(R.id.btnBlog);
        btnSocial = (Button) findViewById(R.id.btnSocial);
        btnEdu = (Button) findViewById(R.id.btnEdu);
        btnGame = (Button) findViewById(R.id.btnGame);
        btnAbout = (Button) findViewById(R.id.btnAbout);


        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutDev.class);
                startActivity(intent);
            }
        });

        btnBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SiteData.class);
                intent.putExtra("siteName","Blog");
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Showing Blogs", Toast.LENGTH_SHORT).show();
            }
        });

        btnSocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SiteData.class);
                intent.putExtra("siteName","Social");
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Showing Social Websites", Toast.LENGTH_SHORT).show();
            }
        });

        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SiteData.class);
                intent.putExtra("siteName","Game");
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Showing Gaming Websites", Toast.LENGTH_SHORT).show();
            }
        });


        btnEdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SiteData.class);
                intent.putExtra("siteName","Edu");
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Showing Educational Website", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
