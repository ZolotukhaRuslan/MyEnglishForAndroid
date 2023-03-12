package com.example.myapplicationenglish.activity.verbsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplicationenglish.R;
import com.example.myapplicationenglish.verbs.VerbsOne;
import com.example.myapplicationenglish.wordslessons.GenerationValue;

public class VerbsOneActivity extends AppCompatActivity {
    private VerbsOne verbsOne = new VerbsOne();
    private GenerationValue generationValue = new GenerationValue();
    private int random;
    private TextView verbsOnEnglish;
    private TextView verbsOnRussian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verbs_one);
    }

    public int clickNextWordVerbsOne(View view){
        verbsOne.initVerbsOneOnRussian();
        random = generationValue.generationValue(verbsOne.getVerbsOneOnRussian().size());
        verbsOnRussian = findViewById(R.id.wordLessonSixRussian);
        verbsOnRussian.setText(verbsOne.getVerbsOneOnRussian().get(random));
        return random;
    }

    public void translateWordVerbsOne(View view){
        verbsOne.initVerbsOnEnglish();
        verbsOnEnglish = findViewById(R.id.wordLessonSixEnglish);
        verbsOnEnglish.setText(verbsOne.getVerbsOneOnEnglish().get(random));
    }
}