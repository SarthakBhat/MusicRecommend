package com.example.mrbhatnagar.musicrecommend;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Main2Activity extends AppCompatActivity {
    ImageView v1, v2, v3, v4, v5, v6;
    private static final String url = "jdbc:mysql://10.0.2.2:3306/admin";
    private static final String user = "root";
    private static final String pass = "";
    String emotion, song, artist;
    int id;
    StringBuffer buffer = new StringBuffer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/


        v1 = (ImageView) findViewById(R.id.happy);
        v2 = (ImageView) findViewById(R.id.love);
        v3 = (ImageView) findViewById(R.id.peace);
        v4 = (ImageView) findViewById(R.id.courage);
        v5 = (ImageView) findViewById(R.id.sorrow);
        v6 = (ImageView) findViewById(R.id.scourage);


        /*
        Bitmap bm = BitmapFactory.decodeResource(getResources(),R.drawable.h1);
        Bitmap bm1 = BitmapFactory.decodeResource(getResources(),R.drawable.l1);
        Bitmap bm2 = BitmapFactory.decodeResource(getResources(),R.drawable.p1);
        Bitmap bm3 = BitmapFactory.decodeResource(getResources(),R.drawable.c1);
        Bitmap bm4 = BitmapFactory.decodeResource(getResources(),R.drawable.s1);
        Bitmap bm5 = BitmapFactory.decodeResource(getResources(),R.drawable.sc1);*/

        /*
        v1.setImageBitmap(bm);
        v2.setImageBitmap(bm1);
        v3.setImageBitmap(bm2);
        v4.setImageBitmap(bm3);
        v5.setImageBitmap(bm4);
        v6.setImageBitmap(bm5);*/

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Happy h = new Happy();
                h.execute();
            }
        });


        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Love l = new Love();
                l.execute();
            }
        });

        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Peace p = new Peace();
                p.execute();
            }
        });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Courage c = new Courage();
                c.execute();
            }
        });

        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Sorrow s = new Sorrow();
                s.execute();
            }
        });
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Scourage sc = new Scourage();
                sc.execute();
            }
        });

    }

    private class Happy extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {

            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection connection = DriverManager.getConnection(url, user, pass);
                // Statement s pr=con.prepareStatement("select Email,Password from admi_table where Email=");
                Statement s = connection.createStatement();
                ResultSet ps = s.executeQuery("select * from emotion where ID = 1");
                while (ps.next()) {
                    emotion = ps.getString(1);
                    song = ps.getString(2);
                    artist = ps.getString(3);

                    // StringBuffer buffer = new StringBuffer();
                    buffer.append("Your Current Predicted Mood:" + emotion + "\n");
                    buffer.append(" Song Recommended :" + song + "\n");
                    buffer.append(" Singer :" + artist + "\n");
                    buffer.append("May be you should listen more songs of :" + artist + "\n");

                    //showMessage("User Data", buffer.toString());
                }
                // showMessage("User Data", buffer.toString());
            } catch (Exception e) {

            }
            return null;
        }
    }

    private class Love extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {

            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection connection = DriverManager.getConnection(url, user, pass);
                // Statement s pr=con.prepareStatement("select Email,Password from admi_table where Email=");
                Statement s = connection.createStatement();
                ResultSet ps = s.executeQuery("select * from emotion where ID = 2");
                while (ps.next()) {
                    emotion = ps.getString(1);
                    song = ps.getString(2);
                    artist = ps.getString(3);

                    // StringBuffer buffer = new StringBuffer();
                    buffer.append("Your Current Predicted Mood:" + emotion + "\n");
                    buffer.append(" Song Recommended :" + song + "\n");
                    buffer.append(" Singer :" + artist + "\n");
                    buffer.append("May be you should listen more songs of :" + artist + "\n");

                    //showMessage("User Data", buffer.toString());
                }
                // showMessage("User Data", buffer.toString());
            } catch (Exception e) {

            }
            return null;
        }
    }

    private class Peace extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {

            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection connection = DriverManager.getConnection(url, user, pass);
                // Statement s pr=con.prepareStatement("select Email,Password from admi_table where Email=");
                Statement s = connection.createStatement();
                ResultSet ps = s.executeQuery("select * from emotion where ID = 4");
                while (ps.next()) {
                    emotion = ps.getString(1);
                    song = ps.getString(2);
                    artist = ps.getString(3);

                    // StringBuffer buffer = new StringBuffer();
                    buffer.append("Your Current Predicted Mood:" + emotion + "\n");
                    buffer.append(" Song Recommended :" + song + "\n");
                    buffer.append(" Singer :" + artist + "\n");
                    buffer.append("May be you should listen more songs of :" + artist + "\n");

                    //showMessage("User Data", buffer.toString());
                }
                // showMessage("User Data", buffer.toString());
            } catch (Exception e) {

            }
            return null;
        }
    }

    private class Courage extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {

            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection connection = DriverManager.getConnection(url, user, pass);
                // Statement s pr=con.prepareStatement("select Email,Password from admi_table where Email=");
                Statement s = connection.createStatement();
                ResultSet ps = s.executeQuery("select * from emotion where ID = 3");
                while (ps.next()) {
                    emotion = ps.getString(1);
                    song = ps.getString(2);
                    artist = ps.getString(3);

                    // StringBuffer buffer = new StringBuffer();
                    buffer.append("Your Current Predicted Mood:" + emotion + "\n");
                    buffer.append(" Song Recommended :" + song + "\n");
                    buffer.append(" Singer :" + artist + "\n");
                    buffer.append("May be you should listen more songs of :" + artist + "\n");

                    //showMessage("User Data", buffer.toString());
                }
                // showMessage("User Data", buffer.toString());
            } catch (Exception e) {

            }
            return null;
        }

    }

    private class Sorrow extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {

            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection connection = DriverManager.getConnection(url, user, pass);
                // Statement s pr=con.prepareStatement("select Email,Password from admi_table where Email=");
                Statement s = connection.createStatement();
                ResultSet ps = s.executeQuery("select * from emotion where ID = 6");
                while (ps.next()) {
                    emotion = ps.getString(1);
                    song = ps.getString(2);
                    artist = ps.getString(3);

                    // StringBuffer buffer = new StringBuffer();
                    buffer.append("Your Current Predicted Mood:" + emotion + "\n");
                    buffer.append(" Song Recommended :" + song + "\n");
                    buffer.append(" Singer :" + artist + "\n");
                    buffer.append("May be you should listen more songs of :" + artist + "\n");

                    //showMessage("User Data", buffer.toString());
                }
                // showMessage("User Data", buffer.toString());
            } catch (Exception e) {

            }
            return null;
        }
    }

    private class Scourage extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {

            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection connection = DriverManager.getConnection(url, user, pass);
                // Statement s pr=con.prepareStatement("select Email,Password from admi_table where Email=");
                Statement s = connection.createStatement();
                ResultSet ps = s.executeQuery("select * from emotion where ID = 5");
                while (ps.next()) {
                    emotion = ps.getString(1);
                    song = ps.getString(2);
                    artist = ps.getString(3);

                    // StringBuffer buffer = new StringBuffer();
                    buffer.append("Your Current Predicted Mood:" + emotion + "\n");
                    buffer.append(" Song Recommended :" + song + "\n");
                    buffer.append(" Singer :" + artist + "\n");
                    buffer.append("May be you should listen more songs of :" + artist + "\n");

                    //showMessage("User Data", buffer.toString());
                }
                // showMessage("User Data", buffer.toString());
            } catch (Exception e) {

            }
            return null;
        }
    }
}