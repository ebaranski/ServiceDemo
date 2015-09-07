package com.example.eric.servicedemo;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void startMethod(View v) {
        Toast.makeText(this, "startMethod Called", Toast.LENGTH_LONG).show();
        //Intent i = new Intent(this, MyService.class);
        Intent i = new Intent(this, SecondService.class);
        i.putExtra("message", "This is my message");
        startService(i);
    }

    public void stopMethod(View v) {
        Toast.makeText(this, "stopMethod Called", Toast.LENGTH_LONG).show();
        Intent i = new Intent(this, MyService.class);
        stopService(i);
    }
}
