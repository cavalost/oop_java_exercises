package com.techreturners.cats;

public class LionCat extends Cat {
    @Override
    public String eat() {
        return "Roar!!!!";
    }

    @Override
    public String getSetting() {
        return "wild";
    }

    @Override
    public int getAverageHeight() {
        return 1100;
    }

}
