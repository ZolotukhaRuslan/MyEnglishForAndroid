package com.example.myapplicationenglish.wordslessons;

import java.util.HashMap;

public class LessonThreeWords {
    private HashMap<Integer, String> wordsLessonThreeOnEnglish = new HashMap<Integer, String>();

    private HashMap<Integer, String> wordsLessonThreeOnRussian= new HashMap<Integer, String>();

    public HashMap<Integer, String> getWordsLessonThreeOnEnglish() {
        return wordsLessonThreeOnEnglish;
    }

    public void setWordsLessonThreeOnEnglish(HashMap<Integer, String> wordsLessonThreeOnEnglish) {
        this.wordsLessonThreeOnEnglish = wordsLessonThreeOnEnglish;
    }

    public HashMap<Integer, String> getWordsLessonThreeOnRussian() {
        return wordsLessonThreeOnRussian;
    }

    public void setWordsLessonThreeOnRussian(HashMap<Integer, String> wordsLessonThreeOnRussian) {
        this.wordsLessonThreeOnRussian = wordsLessonThreeOnRussian;
    }

    public HashMap<Integer, String> initWordsLessonThreeOnEnglish(){
        wordsLessonThreeOnEnglish.put(0, "happen");
        wordsLessonThreeOnEnglish.put(1, "pass");
        wordsLessonThreeOnEnglish.put(2, " to take place");
        wordsLessonThreeOnEnglish.put(3, "to last");
        wordsLessonThreeOnEnglish.put(4, "during");
        wordsLessonThreeOnEnglish.put(5, "keep still and quiet");
        wordsLessonThreeOnEnglish.put(6, "enjoy");
        wordsLessonThreeOnEnglish.put(7, "However");
        wordsLessonThreeOnEnglish.put(8, "straight");
        wordsLessonThreeOnEnglish.put(9, "occur");
        wordsLessonThreeOnEnglish.put(10, "fall");
        wordsLessonThreeOnEnglish.put(11, "At least");
        wordsLessonThreeOnEnglish.put(12, "achievements");
        wordsLessonThreeOnEnglish.put(13, "ago");
        return wordsLessonThreeOnEnglish;
    }
    public HashMap<Integer, String> initWordsLessonThreeOnRussian(){
        wordsLessonThreeOnRussian.put(0, "случатся");
        wordsLessonThreeOnRussian.put(1, "проходить");
        wordsLessonThreeOnRussian.put(2, "проиходит");
        wordsLessonThreeOnRussian.put(3, "длится");
        wordsLessonThreeOnRussian.put(4, "в течении");
        wordsLessonThreeOnRussian.put(5, "спокойствие и устойчивость");
        wordsLessonThreeOnRussian.put(6, "наслаждатся");
        wordsLessonThreeOnRussian.put(7, "однако");
        wordsLessonThreeOnRussian.put(8, "прямо");
        wordsLessonThreeOnRussian.put(9, "появляться");
        wordsLessonThreeOnRussian.put(10, "падает");
        wordsLessonThreeOnRussian.put(11, "как минимум");
        wordsLessonThreeOnRussian.put(12, "достижение");
        wordsLessonThreeOnRussian.put(13, "назад(время)");
        return wordsLessonThreeOnRussian;
    }
}
