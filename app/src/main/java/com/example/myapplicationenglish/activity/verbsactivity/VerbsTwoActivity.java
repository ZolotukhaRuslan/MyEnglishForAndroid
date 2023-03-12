package com.example.myapplicationenglish.activity.verbsactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplicationenglish.R;
import com.example.myapplicationenglish.verbs.VerbsTwo;
import com.example.myapplicationenglish.wordslessons.GenerationValue;

public class VerbsTwoActivity extends AppCompatActivity {
    private VerbsTwo verbsTwo = new VerbsTwo();
    private GenerationValue generationValue = new GenerationValue();
    private int random;
    private TextView verbsOnEnglish;
    private TextView verbsOnRussian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verbs_two);
    }

    public int clickNextWordVerbsTwo(View view){
        verbsTwo.initVerbsTwoOnRussian();
        random = generationValue.generationValue(verbsTwo.getVerbsTwoOnRussian().size());
        verbsOnRussian = findViewById(R.id.wordLessonSixRussian);
        verbsOnRussian.setText(verbsTwo.getVerbsTwoOnRussian().get(random));
        return random;
    }

    public void translateWordVerbsTwo(View view){
        verbsTwo.initVerbsTwoOnEnglish();
        verbsOnEnglish = findViewById(R.id.wordLessonSixEnglish);
        verbsOnEnglish.setText(verbsTwo.getVerbsTwoOnEnglish().get(random));
    }
}