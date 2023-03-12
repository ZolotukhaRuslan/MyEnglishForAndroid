package com.example.myapplicationenglish.activity.lessonsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplicationenglish.R;
import com.example.myapplicationenglish.wordslessons.GenerationValue;
import com.example.myapplicationenglish.wordslessons.LessonSixWords;

public class LessonSix extends AppCompatActivity {
    private int random;
    private GenerationValue generationValue = new GenerationValue();
    private LessonSixWords lessonSixWords = new LessonSixWords();
    private TextView lessonSixWord;
    private TextView translateLessonSixWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_six);
    }

    public int clickNextWordLessonsSix(View view){
        lessonSixWords.initLessonSixOnRussian();
        random = generationValue.generationValue(lessonSixWords.getWordsLessonSixOnRussian().size());
        lessonSixWord = findViewById(R.id.wordLessonSixRussian);
        lessonSixWord.setText(lessonSixWords.getWordsLessonSixOnRussian().get(random));
        return random;
    }

    public void translateWordLessonSix(View view){
        lessonSixWords.initLessonSixOnEnglish();
        translateLessonSixWord = findViewById(R.id.wordLessonSixEnglish);
        translateLessonSixWord.setText(lessonSixWords.getWordsLessonSixOnEnglish().get(random));
    }
}