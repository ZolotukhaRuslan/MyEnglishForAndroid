package com.example.myapplicationenglish.wordslessons;

import java.util.HashMap;

public class LessonTwoWords {
    private HashMap<Integer, String> wordsLessonTwoOnEnglish = new HashMap<Integer, String>();

    private HashMap<Integer, String> wordsLessonTwoOnRussian = new HashMap<Integer, String>();

    public HashMap<Integer, String> getWordsLessonTwoOnEnglish() {
        return wordsLessonTwoOnEnglish;
    }

    public void setWordsLessonTwoOnEnglish(HashMap<Integer, String> wordsLessonTwoOnEnglish) {
        this.wordsLessonTwoOnEnglish = wordsLessonTwoOnEnglish;
    }

    public HashMap<Integer, String> getWordsLessonTwoOnRussian() {
        return wordsLessonTwoOnRussian;
    }

    public void setWordsLessonTwoOnRussian(HashMap<Integer, String> wordsLessonTwoOnRussian) {
        this.wordsLessonTwoOnRussian = wordsLessonTwoOnRussian;
    }

    public HashMap<Integer, String> initLessonTwoOnEnglish() {
        wordsLessonTwoOnEnglish.put(0, "to go out");
        wordsLessonTwoOnEnglish.put(1, "do own");
        wordsLessonTwoOnEnglish.put(2, "child");
        wordsLessonTwoOnEnglish.put(3, "exercise");
        wordsLessonTwoOnEnglish.put(4, "mice");
        wordsLessonTwoOnEnglish.put(5, "brother-in-law");
        wordsLessonTwoOnEnglish.put(6, "scissors");
        wordsLessonTwoOnEnglish.put(7, "preparation");
        wordsLessonTwoOnEnglish.put(8, "to be born");
        wordsLessonTwoOnEnglish.put(9, "forbidden");
        wordsLessonTwoOnEnglish.put(10, "There are (is)");
        wordsLessonTwoOnEnglish.put(11, "It sounds great");
        wordsLessonTwoOnEnglish.put(12, "These look delicious");
        wordsLessonTwoOnEnglish.put(13, "have a rest");
        return wordsLessonTwoOnEnglish;
    }

    public HashMap<Integer, String> initLessonTwoOnRussian() {
        wordsLessonTwoOnRussian.put(0, "ходить гулять");
        wordsLessonTwoOnRussian.put(1, "обладать");
        wordsLessonTwoOnRussian.put(2, "ребёнок");
        wordsLessonTwoOnRussian.put(3, "упражняться/задание");
        wordsLessonTwoOnRussian.put(4, "мыши");
        wordsLessonTwoOnRussian.put(5, "двоюродный брат");
        wordsLessonTwoOnRussian.put(6, "ножницы");
        wordsLessonTwoOnRussian.put(7, "подготовка");
        wordsLessonTwoOnRussian.put(8, "родится");
        wordsLessonTwoOnRussian.put(9, "запрещено");
        wordsLessonTwoOnRussian.put(10, "Сдесь");
        wordsLessonTwoOnRussian.put(11, "Это звучит круто");
        wordsLessonTwoOnRussian.put(12, "Это выглядит вкустно");
        wordsLessonTwoOnRussian.put(13, "отдыхать");
        return wordsLessonTwoOnRussian;

    }
}
