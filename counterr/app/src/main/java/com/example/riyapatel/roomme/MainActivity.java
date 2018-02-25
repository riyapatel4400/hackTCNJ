package com.example.riyapatel.roomme;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    private TextView countValueDisplay;
    private Button happyButton;
    private Button sadButton;

    private String id;

    private View.OnClickListener myClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.happy:

                case R.id.sad;

            }
            countValueDisplay.setText(String.valueOf(count));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);

        countValueDisplay = findViewById(R.id.count);
        happyButton = findViewById(R.id.happy);
        sadButton = findViewById(R.id.sad);

        happyButton.setOnClickListener(myClickListener);
        sadButton.setOnClickListener(myClickListener);
    }
}
