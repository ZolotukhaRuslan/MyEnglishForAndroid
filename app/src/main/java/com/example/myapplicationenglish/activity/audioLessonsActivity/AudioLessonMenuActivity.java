package com.example.myapplicationenglish.activity.audioLessonsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.myapplicationenglish.R;


public class AudioLessonMenuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_lesson_menu);

    }

public void audioLessonOne(View view){
        Intent intent = new Intent(this, AudioLessonOneActivity.class);
        startActivity(intent);
}




}