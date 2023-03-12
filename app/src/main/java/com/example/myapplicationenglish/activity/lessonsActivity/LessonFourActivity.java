package com.example.myapplicationenglish.activity.lessonsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplicationenglish.R;
import com.example.myapplicationenglish.wordslessons.GenerationValue;
import com.example.myapplicationenglish.wordslessons.LessonFourWords;

public class LessonFourActivity extends AppCompatActivity {
    private int random;
    private LessonFourWords lessonFourWords = new LessonFourWords();
    private GenerationValue generationValue = new GenerationValue();
    private TextView wordLessonFour;
    private TextView translateWordLessonFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_four);
    }
    public int clickNextWordLessonFour(View view){
        lessonFourWords.initLessonFourOnRussian();
        random = generationValue.generationValue(lessonFourWords.getWordsLessonFourOnRussian().size());
        wordLessonFour = findViewById(R.id.wordLessonSixRussian);
        wordLessonFour.setText(lessonFourWords.getWordsLessonFourOnRussian().get(random));
        return random;
    }
    public void translateWordLessonFour(View view){
        lessonFourWords.initLessonFourOnEnglish();
        translateWordLessonFour = findViewById(R.id.wordLessonSixEnglish);
        translateWordLessonFour.setText(lessonFourWords.getWordsLessonFourOnEnglish().get(random));
    }
}