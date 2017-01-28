package com.familyapp.mdazizulhakim.myfavouritesite;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SiteData extends AppCompatActivity {
    ActionBar actionBar;

    private String SocialUrl1 = "www.facebook.com";
    private String SocialUrl2 = "www.plus.google.com";
    private String SocialUrl3 = "www.twitter.com";
    private String SocialUrl4 = "www.youtube.com";
    private String SocialUrl5 = "www.Instagram.com";

    private String BlogUrl1 = "www.huffingtonpost.com";
    private String BlogUrl2 = "www.tmz.com";
    private String BlogUrl3 = "www.businessinsider.com";
    private String BlogUrl4 = "www.mashable.com";
    private String BlogUrl5 = "www.lifehacker.com";

    private String EduUrl1 = "www.khanacademy.org";
    private String EduUrl2 = "www.codecademy.com";
    private String EduUrl3 = "www.skillshare.com";
    private String EduUrl4 = "www.udacity.com";
    private String EduUrl5 = "www.lynda.com";

    private String Gameurl1 = "www.ign.com";
    private String Gameurl2 = "www.gamefaqs.com";
    private String Gameurl3 = "www.gamespot.com";
    private String Gameurl4 = "www.pcgamer.com";
    private String Gameurl5 = "www.cheatcc.com";

    Button btnUrl1, btnUrl2, btnUrl3, btnUrl4, btnUrl5;
    TextView SiteData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_data);
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.DKGRAY));

        String getSite = getIntent().getExtras().getString("siteName");

        btnUrl1 = (Button) findViewById(R.id.btnUrl1);
        btnUrl2 = (Button) findViewById(R.id.btnUrl2);
        btnUrl3 = (Button) findViewById(R.id.btnUrl3);
        btnUrl4 = (Button) findViewById(R.id.btnUrl4);
        btnUrl5 = (Button) findViewById(R.id.btnUrl5);

        SiteData = (TextView) findViewById(R.id.txtSite);


        if (getSite.equals("Blog")) {

            actionBar.setTitle("Blog");
            SiteData.setText("Blog");
            btnUrl1.setText("huffingtonpost");
            btnUrl2.setText("TMZ");
            btnUrl3.setText("businessinsider");
            btnUrl4.setText("mashable");
            btnUrl5.setText("lifehacker");

            btnUrl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + BlogUrl1));
                    startActivity(intent);
                }
            });

            btnUrl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + BlogUrl2));
                    startActivity(intent);
                }
            });


            btnUrl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + BlogUrl3));
                    startActivity(intent);
                }
            });


            btnUrl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + BlogUrl4));
                    startActivity(intent);
                }
            });


            btnUrl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + BlogUrl5));
                    startActivity(intent);
                }
            });
        }
        if (getSite.equals("Social")) {

            actionBar.setTitle("Social");
            SiteData.setText("Social");
            btnUrl1.setText("facebook");
            btnUrl2.setText("google plus");
            btnUrl3.setText("twitter");
            btnUrl4.setText("Youtube");
            btnUrl5.setText("instragram");

            btnUrl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + SocialUrl1));
                    startActivity(intent);
                }
            });

            btnUrl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + SocialUrl2));
                    startActivity(intent);
                }
            });


            btnUrl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + SocialUrl3));
                    startActivity(intent);
                }
            });


            btnUrl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + SocialUrl4));
                    startActivity(intent);
                }
            });


            btnUrl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + SocialUrl5));
                    startActivity(intent);
                }
            });
        }

        if (getSite.equals("Game")) {
            actionBar.setTitle("Game");
            SiteData.setText("Gaming");
            btnUrl1.setText("Ign");
            btnUrl2.setText("gamefaqs");
            btnUrl3.setText("gamespot");
            btnUrl4.setText("pcgamer");
            btnUrl5.setText("Cheatcc");

            btnUrl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + Gameurl1));
                    startActivity(intent);
                }
            });

            btnUrl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + Gameurl2));
                    startActivity(intent);
                }
            });


            btnUrl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + Gameurl3));
                    startActivity(intent);
                }
            });


            btnUrl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + Gameurl4));
                    startActivity(intent);
                }
            });


            btnUrl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + Gameurl5));
                    startActivity(intent);
                }
            });
        }

        if (getSite.equals("Edu"))
        {
            actionBar.setTitle("Education");
            SiteData.setText("Educational");
            btnUrl1.setText("khanacademy");
            btnUrl2.setText("codecademy");
            btnUrl3.setText("skillshare");
            btnUrl4.setText("udacity");
            btnUrl5.setText("lynda");

            btnUrl1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + EduUrl1));
                    startActivity(intent);
                }
            });

            btnUrl2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + EduUrl2));
                    startActivity(intent);
                }
            });


            btnUrl3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + EduUrl3));
                    startActivity(intent);
                }
            });


            btnUrl4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + EduUrl4));
                    startActivity(intent);
                }
            });


            btnUrl5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + EduUrl5));
                    startActivity(intent);
                }
            });
        }


    }
}
