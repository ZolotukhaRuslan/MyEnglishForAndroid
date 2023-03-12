package com.example.myapplicationenglish.activity.lessonsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplicationenglish.R;

public class LessonMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_menu);
    }

        public void clickOneForFour(View view){
            Intent intent = new Intent(this, MenuLessonOneForFourActivity.class);
            startActivity(intent);
        }

        public void clickFiveForNine(View view){
        Intent intent = new Intent(this, MenuLessonFiveForNine.class);
        startActivity(intent);
        }

}