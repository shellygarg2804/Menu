package com.example.menu;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView Item1= (TextView)findViewById(R.id.menu_item_1);
        String I1= Item1.getText().toString();
        Log.v("MainActivity",I1);

        // Find second menu item TextView and print the text to the logs
        TextView Item2= (TextView)findViewById(R.id.menu_item_2);
        String I2= Item2.getText().toString();
        Log.v("MainActivity",I2);

        // Find third menu item TextView and print the text to the logs
        TextView Item3= (TextView)findViewById(R.id.menu_item_3);
        String I3= Item3.getText().toString();
        Log.v("MainActivity",I3);
    }
}