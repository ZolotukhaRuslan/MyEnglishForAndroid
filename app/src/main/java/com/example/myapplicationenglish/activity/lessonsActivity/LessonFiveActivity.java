package com.example.myapplicationenglish.activity.lessonsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplicationenglish.R;
import com.example.myapplicationenglish.wordslessons.GenerationValue;
import com.example.myapplicationenglish.wordslessons.LessonFiveWords;

public class LessonFiveActivity extends AppCompatActivity {

    private int random;
    private LessonFiveWords lessonFiveWords = new LessonFiveWords();
    private GenerationValue generationValue = new GenerationValue();
    private TextView wordLessonFive;
    private TextView translateWordLessonFive;

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public LessonFiveWords getLessonFiveWords() {
        return lessonFiveWords;
    }

    public void setLessonFiveWords(LessonFiveWords lessonFiveWords) {
        this.lessonFiveWords = lessonFiveWords;
    }

    public GenerationValue getGenerationValue() {
        return generationValue;
    }

    public void setGenerationValue(GenerationValue generationValue) {
        this.generationValue = generationValue;
    }

    public TextView getWordLessonFive() {
        return wordLessonFive;
    }

    public void setWordLessonFive(TextView wordLessonFive) {
        this.wordLessonFive = wordLessonFive;
    }

    public TextView getTranslateWordLessonFive() {
        return translateWordLessonFive;
    }

    public void setTranslateWordLessonFive(TextView translateWordLessonFive) {
        this.translateWordLessonFive = translateWordLessonFive;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_five);
    }

    public int clickNextWordLessonFive(View view) {
        lessonFiveWords.initLessonFiveOnRussian();
        random = generationValue.generationValue(lessonFiveWords.initLessonFiveOnRussian().size());
        wordLessonFive = findViewById(R.id.wordLessonSixRussian);
        wordLessonFive.setText(lessonFiveWords.initLessonFiveOnRussian().get(random));
        return random;
    }

    public void translateWordLessonFive(View view) {
        lessonFiveWords.initLessonFiveOnEnglish();
        translateWordLessonFive = findViewById(R.id.wordLessonSixEnglish);
        translateWordLessonFive.setText(lessonFiveWords.initLessonFiveOnEnglish().get(random));
    }
}