package com.Class.Study250526.homeWork;

public class Music {
    private String name;
    private int duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Music() {
    }

    public Music(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
}
