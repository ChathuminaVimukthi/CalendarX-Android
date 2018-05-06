package com.example.chathumina.calendarxexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.calendar_x.CalendarDebug;
import com.example.calendar_x_main.CalendarX;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarX cal = findViewById(R.id.chathumina_Cal);
        cal.setUserCurrentMonthYear(2, 2017);

        cal.setCallBack(new CalendarX.DayClickListener() {
            @Override
            public void onDayClick(View view) {

            }
        });
    }
}
