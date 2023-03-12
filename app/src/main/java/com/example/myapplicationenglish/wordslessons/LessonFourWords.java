package com.example.myapplicationenglish.wordslessons;

import java.util.HashMap;

public class LessonFourWords {
    private HashMap<Integer, String> wordsLessonFourOnEnglish = new HashMap<Integer, String>();

    private HashMap<Integer, String> wordsLessonFourOnRussian = new HashMap<Integer, String>();

    public HashMap<Integer, String> getWordsLessonFourOnEnglish() {
        return wordsLessonFourOnEnglish;
    }

    public void setWordsLessonFourOnEnglish(HashMap<Integer, String> wordsLessonFourOnEnglish) {
        this.wordsLessonFourOnEnglish = wordsLessonFourOnEnglish;
    }

    public HashMap<Integer, String> getWordsLessonFourOnRussian() {
        return wordsLessonFourOnRussian;
    }

    public void setWordsLessonFourOnRussian(HashMap<Integer, String> wordsLessonFourOnRussian) {
        this.wordsLessonFourOnRussian = wordsLessonFourOnRussian;
    }

   public HashMap<Integer, String> initLessonFourOnEnglish(){
        wordsLessonFourOnEnglish.put(0, "consist of");
        wordsLessonFourOnEnglish.put(1, "benefits");
        wordsLessonFourOnEnglish.put(2, "current");
        wordsLessonFourOnEnglish.put(3, "ability");
        wordsLessonFourOnEnglish.put(4, "with in");
        wordsLessonFourOnEnglish.put(5, "collect");
        wordsLessonFourOnEnglish.put(6,"rubbish");
        wordsLessonFourOnEnglish.put(7, "tent");
        wordsLessonFourOnEnglish.put(8, "bring");
        wordsLessonFourOnEnglish.put(9, "change");
        wordsLessonFourOnEnglish.put(10, "local");
        wordsLessonFourOnEnglish.put(11, "measure");
        wordsLessonFourOnEnglish.put(12, "causes");
        wordsLessonFourOnEnglish.put(13, "overeat");
        wordsLessonFourOnEnglish.put(14, "smell");
        wordsLessonFourOnEnglish.put(15, "attract");
       wordsLessonFourOnEnglish.put(16, "doubt");
        return wordsLessonFourOnEnglish;
    }

    public HashMap<Integer, String> initLessonFourOnRussian() {
        wordsLessonFourOnRussian.put(0, "Состоит из");
        wordsLessonFourOnRussian.put(1, "полезность");
        wordsLessonFourOnRussian.put(2, "настоящие");
        wordsLessonFourOnRussian.put(3, "возможности");
        wordsLessonFourOnRussian.put(4, "среди");
        wordsLessonFourOnRussian.put(5, "собирать");
        wordsLessonFourOnRussian.put(6, "мусор");
        wordsLessonFourOnRussian.put(7, "палатка");
        wordsLessonFourOnRussian.put(8, "приносить");
        wordsLessonFourOnRussian.put(9, "изменить");
        wordsLessonFourOnRussian.put(10, "местный");
        wordsLessonFourOnRussian.put(11, "измерять");
        wordsLessonFourOnRussian.put(12, "являтся причиной");
        wordsLessonFourOnRussian.put(13, "переедать");
        wordsLessonFourOnRussian.put(14, "пахнуть/нюхать");
        wordsLessonFourOnRussian.put(15, "привлекать");
        wordsLessonFourOnRussian.put(16, "сомневатся");
        return wordsLessonFourOnRussian;
    }
}
