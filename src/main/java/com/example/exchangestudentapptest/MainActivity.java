package com.example.exchangestudentapptest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView todoCard, timetableCard, timezoneCard, currencyCard, traductorCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoCard = (CardView) findViewById(R.id.todoId);
        timetableCard = (CardView) findViewById(R.id.timetableID);
        timezoneCard = (CardView) findViewById(R.id.timezoneID);
        currencyCard = (CardView) findViewById(R.id.currencyID);
        traductorCard = (CardView) findViewById(R.id.translatorID);
    }

    public void onClick(View view){
        Intent i;
        switch (view.getId()){
            case R.id.todoId: i = new Intent(this, TodoList.class); startActivity(i); break;
            case R.id.timetableID: i = new Intent(this, timetable.class); startActivity(i); break;
            case R.id.timezoneID: i = new Intent(this, timezone.class); startActivity(i); break;
            case R.id.currencyID: i = new Intent(this, currency.class); startActivity(i); break;
            case R.id.translatorID: i = new Intent(this, traductor.class); startActivity(i); break;
            default:break;

        }

    }

}