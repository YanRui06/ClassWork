package com.Class.Study250526.ClassProgream;

public  abstract class Persion {
    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Persion() {
    }

    public Persion(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public abstract void interoduction();
}
