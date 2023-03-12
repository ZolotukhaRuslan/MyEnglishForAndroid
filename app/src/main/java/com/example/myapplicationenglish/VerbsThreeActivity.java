package com.example.myapplicationenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplicationenglish.verbs.VerbsThree;
import com.example.myapplicationenglish.wordslessons.GenerationValue;

public class VerbsThreeActivity extends AppCompatActivity {
    private int random;
    private GenerationValue generationValue = new GenerationValue();
    private VerbsThree verbsThree = new VerbsThree();
    private TextView verbsOnRussian;
    private TextView verbsOnEnglish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verbs_three);
    }

    public int clickNextWordLessonThree(View view){
        verbsThree.initVerbsThreeOnRussian();
        random = generationValue.generationValue(verbsThree.getVerbsThreeOnRussian().size());
        verbsOnRussian = findViewById(R.id.wordLessonSixRussian);
        verbsOnRussian.setText(verbsThree.getVerbsThreeOnRussian().get(random));
        return random;
    }

    public void translateWordLessonThree(View view){
        verbsThree.initVerbsThreeOnEnglish();
        verbsOnEnglish = findViewById(R.id.wordLessonSixEnglish);
        verbsOnEnglish.setText(verbsThree.getVerbsThreeOnEnglish().get(random));
    }
}