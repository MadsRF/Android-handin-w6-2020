package com.example.week6assign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //create handler for the next page
    public void goToPage2(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    //create handler for the prev page
    public void goBackToPage3(View view){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

}
