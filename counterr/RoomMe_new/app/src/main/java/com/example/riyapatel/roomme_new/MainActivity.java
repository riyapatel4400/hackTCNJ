package com.example.riyapatel.roomme_new;

import android.app.Activity;
//import android.content.SharedPreferences;
import android.os.Bundle;

//import android.support.annotation.Nullable;
import android.util.Log;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

//import java.util.Calendar;
//import java.util.Map;
//import java.util.Set;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private TextView countValueDisplay;
    private Button thisWeek;
    private Button calendar;
    private Button payments;
    private Button settings;


    private long count = 0;

    private View.OnClickListener myClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
//                case R.id.thisWeek:
//                    startActivity(new Intent(MainActivity.this, MainActivity.class));
//                    break;
                case R.id.calendar:
                    startActivity(new Intent(MainActivity.this, ScheduleActivity.class));
                    break;
                case R.id.payments:
                    startActivity(new Intent(MainActivity.this, PaymentActivity.class));
                    break;
                case R.id.settings:
                    startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                    break;
            }
            Log.d(TAG, String.format("The new count is: %d", count));
            countValueDisplay.setText(String.valueOf(count));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thisWeek = findViewById(R.id.thisWeek);
        calendar = findViewById(R.id.calendar);
        payments = findViewById(R.id.payments);
        settings = findViewById(R.id.settings);
        thisWeek.setOnClickListener(myClickListener);
    }


}


//          private static final String MY_KEY = "myKey";
// SharedPreferences sp = getPreferences(MODE_PRIVATE);
//        sp.edit()
//                .putString(MY_KEY, "This is the string value I'm storing")
//                .commit();
//
//        String myStr = sp.getString(MY_KEY, "");
//        if (!myStr.isEmpty()) {
//            myTextView.setText(myStr);
//        }
//
