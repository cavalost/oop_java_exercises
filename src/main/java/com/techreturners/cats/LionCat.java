package com.techreturners.cats;

public class LionCat implements Cat {
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
