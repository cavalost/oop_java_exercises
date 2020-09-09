package com.techreturners.cats;

public class DomesticCat implements Cat {
    private boolean isAsleepNow = false;

    @Override
    public boolean goToSleep() {
        return isAsleepNow = true;
    }

    @Override
    public boolean wakeUp() {
        return isAsleepNow = false;
    }

    @Override
    public boolean isAsleep() {
        return isAsleepNow;
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }

    @Override
    public String getSetting() {
        return "domestic";
    }

    @Override
    public int getAverageHeight() {
        return 23;
    }
}
