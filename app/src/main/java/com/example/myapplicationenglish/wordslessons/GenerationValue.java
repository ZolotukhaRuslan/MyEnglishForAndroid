package com.example.myapplicationenglish.wordslessons;

public class GenerationValue {
    int mathRandom;

    public int generationValue(int value){
        mathRandom = (int) (Math.random()* value);
        return mathRandom;
    }
}
