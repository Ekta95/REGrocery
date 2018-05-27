package com.example.as.regrocery;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=4000;
    Calendar c=Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent= new Intent(MainActivity.this,Home.class);
                startActivity(homeIntent);

                int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
                if(dayOfMonth==10){
                    NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
                    builder.setSmallIcon(android.R.drawable.ic_dialog_alert);
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bigbasket.com/"));
                    PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);
                    builder.setContentIntent(pendingIntent);
                    builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
                    builder.setContentTitle("Tap to buy from BigBasket.");
                    builder.setContentText("Buy some Groceries.");
                    builder.setSubText("Time to update your List");


                    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                    // Will display the notification in the notification bar
                    notificationManager.notify(1, builder.build());
                }
               finish();
            }
        },SPLASH_TIME_OUT);
    }
}