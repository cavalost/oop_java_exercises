package com.techreturners.cats;

public abstract class Cat implements Animal {
    private boolean isAsleepNow = false;
    private String food;
    private String setting;
    private int averageHeight;

    public Cat() {}

    public Cat(String food, String setting, int averageHeight) {
        this.food = food;
        this.setting = setting;
        this.averageHeight = averageHeight;
    }

    public String eat() {
        return this.food;
    }

    public String getSetting() {
        return this.setting;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }

    public boolean goToSleep() {
        return this.isAsleepNow = true;
    }

    public boolean wakeUp() {
        return this.isAsleepNow = false;
    }

    public boolean isAsleep() {
        return this.isAsleepNow;
    }
}
