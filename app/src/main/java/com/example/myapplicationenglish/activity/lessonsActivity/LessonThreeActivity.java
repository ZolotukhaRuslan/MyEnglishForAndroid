package com.example.myapplicationenglish.activity.lessonsActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplicationenglish.R;
import com.example.myapplicationenglish.wordslessons.GenerationValue;
import com.example.myapplicationenglish.wordslessons.LessonThreeWords;

public class LessonThreeActivity extends AppCompatActivity {
    private int random;
    private LessonThreeWords lessonThreeWords = new LessonThreeWords();
    private GenerationValue generationValue = new GenerationValue();
    private TextView lessonThreeWord;
    private TextView translateWordLessonThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_three);
    }

    public int clickNextWordLessonThree(View view){
        lessonThreeWords.initWordsLessonThreeOnRussian();
        random = generationValue.generationValue(lessonThreeWords.getWordsLessonThreeOnRussian().size());
        lessonThreeWord = findViewById(R.id.wordLessonSixRussian);
        lessonThreeWord.setText(lessonThreeWords.getWordsLessonThreeOnRussian().get(random));
        return random;
    }

    public void translateWordLessonThree(View view){
        lessonThreeWords.initWordsLessonThreeOnEnglish();
        translateWordLessonThree = findViewById(R.id.wordLessonSixEnglish);
        translateWordLessonThree.setText(lessonThreeWords.getWordsLessonThreeOnEnglish().get(random));
    }
}