package com.example.myapplicationenglish.activity.lessonsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplicationenglish.R;
import com.example.myapplicationenglish.activity.lessonsActivity.LessonFourActivity;
import com.example.myapplicationenglish.activity.lessonsActivity.LessonOneActivity;
import com.example.myapplicationenglish.activity.lessonsActivity.LessonThreeActivity;
import com.example.myapplicationenglish.activity.lessonsActivity.LessonTwoActivity;

public class MenuLessonOneForFourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_lesson_one_for_four);
    }

    public void lessonOneStart(View view) {
        Intent intent = new Intent(this, LessonOneActivity.class);
        startActivity(intent);
    }

    public void lessonTwoStart(View view) {
        Intent intent = new Intent(this, LessonTwoActivity.class);
        startActivity(intent);
    }

    public void lessonThreeStart(View view) {
        Intent intent = new Intent(this, LessonThreeActivity.class);
        startActivity(intent);
    }

    public void lessonFourStart(View view) {
        Intent intent = new Intent(this, LessonFourActivity.class);
        startActivity(intent);
    }
}