package com.example.myapplicationenglish.activity.lessonsActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplicationenglish.R;
import com.example.myapplicationenglish.wordslessons.GenerationValue;
import com.example.myapplicationenglish.wordslessons.LessonTwoWords;

public class LessonTwoActivity extends AppCompatActivity {
    private int random;
   private LessonTwoWords lessonTwoWords = new LessonTwoWords();
    private GenerationValue generationValue = new GenerationValue();
    private TextView lessonTwoWord;
    private TextView translateLessonTwoWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_two);
    }

    public int clickNextWordLessonTwo(View view) {
        lessonTwoWords.initLessonTwoOnRussian();
        random = generationValue.generationValue(lessonTwoWords.getWordsLessonTwoOnRussian().size());
        lessonTwoWord = findViewById(R.id.wordLessonSixRussian);
        lessonTwoWord.setText(lessonTwoWords.getWordsLessonTwoOnRussian().get(random));
        return random;
    }

    public void translateWordLessonTwo(View view) {
        lessonTwoWords.initLessonTwoOnEnglish();
       translateLessonTwoWord = findViewById(R.id.wordLessonSixEnglish);
       translateLessonTwoWord.setText(lessonTwoWords.getWordsLessonTwoOnEnglish().get(random));
    }
}