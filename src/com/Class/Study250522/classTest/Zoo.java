package com.Class.Study250522.classTest;

public abstract class Zoo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zoo() {
    }

    public Zoo(String name) {
        this.name = name;
    }

    public abstract void talk();
}
