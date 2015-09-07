package com.example.eric.servicedemo;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * This type of service runs in separate thread from app
 * There is no need to stop this type of service as it is
 *   taken care of by the O/S
 */
public class SecondService extends IntentService {

    public SecondService() {
        super("My Service");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service is created", Toast.LENGTH_LONG).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service is StartCommand", Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("Service Test", "from the onHandleIntent method");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service is Destroyed", Toast.LENGTH_LONG).show();
    }
}
