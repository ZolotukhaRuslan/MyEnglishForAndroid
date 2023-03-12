package com.example.myapplicationenglish.activity.lessonsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplicationenglish.R;
import com.example.myapplicationenglish.wordslessons.GenerationValue;
import com.example.myapplicationenglish.wordslessons.LessonOneWords;

public class LessonOneActivity extends AppCompatActivity {
    private int random;
    private LessonOneWords lessonOneWords = new LessonOneWords();
    private GenerationValue generationValue = new GenerationValue();
    private TextView lessonOneWord;
    private TextView translateLessonOneWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_one);
    }


    public int clickNextWordLessonOne(View view) {
        lessonOneWords.initLessonOneOnRussian();
        random = generationValue.generationValue(lessonOneWords.getWordsLessonOneOnRussian().size());
        lessonOneWord = findViewById(R.id.wordLessonSixRussian);
        lessonOneWord.setText(lessonOneWords.getWordsLessonOneOnRussian().get(random));
        return random;
    }

    public void translateWordLessonOne(View view) {
        lessonOneWords.initLessonOneOnEnglish();
        translateLessonOneWord = findViewById(R.id.wordLessonSixEnglish);
        translateLessonOneWord.setText(lessonOneWords.getWordsLessonOneOnEnglish().get(random));
    }
}