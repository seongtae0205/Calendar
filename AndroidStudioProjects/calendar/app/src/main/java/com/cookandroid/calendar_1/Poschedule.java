package com.cookandroid.calendar_1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;

public class Poschedule extends AppCompatActivity {
    private ImageButton b;
    private static final String TAG = "Poschedule";
    private CalendarView c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poschedule);


        b = (ImageButton) findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Poschedule.this, second.class);
                startActivity(intent);
            }
        });
        c=(CalendarView)findViewById(R.id.calendar);
        c.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                String date = year + "/" + month + "/"+ dayOfMonth ;
                Log.d(TAG, "onSelectedDayChange: yyyy/mm/dd:" + date);
                Intent intent = new Intent(Poschedule.this,second.class);
                intent.putExtra("date",date);
                startActivity(intent);
            }
        });
    }
}
