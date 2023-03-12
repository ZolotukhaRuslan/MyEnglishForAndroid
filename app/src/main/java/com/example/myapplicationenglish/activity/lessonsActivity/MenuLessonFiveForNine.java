package com.example.myapplicationenglish.activity.lessonsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplicationenglish.R;

public class MenuLessonFiveForNine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_five_for_nine);
    }

    public void lessonFiveStart(View view) {
        Intent intent = new Intent(this, LessonFiveActivity.class);
        startActivity(intent);
    }

    public void lessonSixStart(View view){
        Intent intent = new Intent(this, LessonSix.class);
        startActivity(intent);
    }
}