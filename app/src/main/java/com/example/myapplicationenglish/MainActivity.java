package com.example.myapplicationenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplicationenglish.activity.audioLessonsActivity.AudioLessonMenuActivity;
import com.example.myapplicationenglish.activity.lessonsActivity.LessonMenuActivity;
import com.example.myapplicationenglish.activity.verbsactivity.VerbsMenuActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lessonsMenu(View view) {
        Intent intent = new Intent(this, LessonMenuActivity.class);
        startActivity(intent);
    }

    public void verbsMenu(View view) {
        Intent intent = new Intent(this, VerbsMenuActivity.class);
        startActivity(intent);
    }

public void audioLessonsMenu(View view){
        Intent intent = new Intent(this, AudioLessonMenuActivity.class);
   // Intent intent = new Intent(this, AudioLessonOneActivity.class);
        startActivity(intent);
}


}