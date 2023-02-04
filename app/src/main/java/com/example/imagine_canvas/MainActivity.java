package com.example.imagine_canvas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   
    public void freeDrawClicked(View view){
        Intent drawingActivity = new Intent(MainActivity.this,DrawingActivity.class);
        startActivity(drawingActivity);

    }
    public void aboutClicked(View view){
        Intent aboutActivity = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(aboutActivity);
    }
}