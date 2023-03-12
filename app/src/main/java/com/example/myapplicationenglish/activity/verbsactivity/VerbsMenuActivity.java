package com.example.myapplicationenglish.activity.verbsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplicationenglish.R;
import com.example.myapplicationenglish.VerbsThreeActivity;

import java.time.Instant;

public class VerbsMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verbs_menu);
    }

    public void verbsOne(View view){
        Intent intent = new Intent(this, VerbsOneActivity.class);
        startActivity(intent);
    }
    public void verbsTwo(View view){
        Intent intent = new Intent(this, VerbsTwoActivity.class);
        startActivity(intent);
    }
    public void verbsThree(View view){
        Intent intent = new Intent(this, VerbsThreeActivity.class);
        startActivity(intent);
    }
}