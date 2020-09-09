package com.techreturners.cats;

public class CheetahCat implements Cat {
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
        return false;
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }

    @Override
    public String getSetting() {
        return "wild";
    }

    @Override
    public int getAverageHeight() {
        return 90;
    }
}
