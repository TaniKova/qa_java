package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private final Feline feline;

    public Lion(Feline feline, String sex) throws Exception {
        /*Здесь мне пришлось заменить русские названия на английские,
        т.к. по неизвестной мне причине получалось, что "Самец".equals("Самец") = false, какая-то беда с кодировкой.*/
        this.feline = feline;
        if ("Male".equals(sex)) {
            hasMane = true;
        } else if ("Female".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Please use one of these options: female or male");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
