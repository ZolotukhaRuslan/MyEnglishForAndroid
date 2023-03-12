package com.example.myapplicationenglish.verbs;

import java.util.HashMap;

public class VerbsOne {
    private HashMap<Integer, String> verbsOneOnRussian = new HashMap<>();
    private HashMap<Integer, String> verbsOneOnEnglish = new HashMap<>();

    public HashMap<Integer, String> getVerbsOneOnEnglish() {
        return verbsOneOnEnglish;
    }

    public void setVerbsOneOnEnglish(HashMap<Integer, String> verbsOneOnEnglish) {
        this.verbsOneOnEnglish = verbsOneOnEnglish;
    }

    public HashMap<Integer, String> getVerbsOneOnRussian() {
        return verbsOneOnRussian;
    }

    public void setVerbsOneOnRussian(HashMap<Integer, String> verbsOneOnRussian) {
        this.verbsOneOnRussian = verbsOneOnRussian;
    }

    public HashMap<Integer, String> initVerbsOneOnRussian(){
        verbsOneOnRussian.put(0,"быть");
        verbsOneOnRussian.put(1,"иметь");
        verbsOneOnRussian.put(2,"делать");
        verbsOneOnRussian.put(3,"говорить");
        verbsOneOnRussian.put(4,"идти");
        verbsOneOnRussian.put(5,"получать");
        verbsOneOnRussian.put(6,"сделать");
        verbsOneOnRussian.put(7,"знать");
        verbsOneOnRussian.put(8,"думать");
        verbsOneOnRussian.put(9,"брать");
        verbsOneOnRussian.put(10,"видеть");
        verbsOneOnRussian.put(11,"приходить");
        verbsOneOnRussian.put(12,"хотеть");
        verbsOneOnRussian.put(13,"использовать");
        verbsOneOnRussian.put(14,"находить");
        verbsOneOnRussian.put(15,"давать");
        verbsOneOnRussian.put(16,"рассказывать");
        verbsOneOnRussian.put(17,"работать");
        verbsOneOnRussian.put(18,"звонить/звать");
        verbsOneOnRussian.put(19,"пытаться");
        verbsOneOnRussian.put(20,"спрашивать/просить");
        verbsOneOnRussian.put(21,"нуждаться");
        verbsOneOnRussian.put(22,"чувствовать");
        verbsOneOnRussian.put(23,"становиться");
        verbsOneOnRussian.put(24,"оставлять");
        verbsOneOnRussian.put(25,"класть");
        verbsOneOnRussian.put(26,"значить");
        verbsOneOnRussian.put(27,"хранить");
        verbsOneOnRussian.put(28,"позволять");
        verbsOneOnRussian.put(29,"начинать");
        return verbsOneOnRussian;
    }

    public  HashMap<Integer, String> initVerbsOnEnglish(){
        verbsOneOnEnglish.put(0,"be were been");
        verbsOneOnEnglish.put(1,"have had had");
        verbsOneOnEnglish.put(2,"do did done");
        verbsOneOnEnglish.put(3,"say said said");
        verbsOneOnEnglish.put(4,"go went gone");
        verbsOneOnEnglish.put(5,"get got gotten");
        verbsOneOnEnglish.put(6,"make made made");
        verbsOneOnEnglish.put(7,"know knew known");
        verbsOneOnEnglish.put(8,"think thought thought");
        verbsOneOnEnglish.put(9,"take took taken");
        verbsOneOnEnglish.put(10,"see saw seen");
        verbsOneOnEnglish.put(11,"come came come");
        verbsOneOnEnglish.put(12,"want wanted wanted");
        verbsOneOnEnglish.put(13,"use used used");
        verbsOneOnEnglish.put(14,"find found found");
        verbsOneOnEnglish.put(15,"give gave given");
        verbsOneOnEnglish.put(16,"tell told told");
        verbsOneOnEnglish.put(17,"work worked worked");
        verbsOneOnEnglish.put(18,"call called called");
        verbsOneOnEnglish.put(19,"try tried tried");
        verbsOneOnEnglish.put(20,"ask asked asked");
        verbsOneOnEnglish.put(21,"need needed needed");
        verbsOneOnEnglish.put(22,"feel felt felt");
        verbsOneOnEnglish.put(23,"become became become");
        verbsOneOnEnglish.put(24,"leave left left");
        verbsOneOnEnglish.put(25,"put put put");
        verbsOneOnEnglish.put(26,"mean meant meant");
        verbsOneOnEnglish.put(27,"keep kept kept");
        verbsOneOnEnglish.put(28,"let let let");
        verbsOneOnEnglish.put(29,"begin began begun");
        return verbsOneOnEnglish;
    }
}
