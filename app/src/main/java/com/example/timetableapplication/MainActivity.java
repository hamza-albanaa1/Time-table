package com.example.timetableapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView ;


    public void generatetable (int timetablenumber) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int j = 1; j < 20; j++) {
            arrayList.add(Integer.toString(j*timetablenumber));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview1);
        SeekBar seekBar = findViewById(R.id.seekBar);






       int max = 20;
        int start = 10;


     seekBar.setMax(max);
     seekBar.setProgress(start);
     generatetable(10);






        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int min = 1;
                int timetablenumber ;
                if (i<min){
                    timetablenumber =min;
                }else{
                    timetablenumber = i;
                }
                generatetable(timetablenumber);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }


        });








    }





}
