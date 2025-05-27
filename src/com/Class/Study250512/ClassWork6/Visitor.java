package com.Class.Study250512.ClassWork6;

public class Visitor {
    private String visitorName;
    private int visitorAge;

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public int getVisitorAge() {
        return visitorAge;
    }

    public void setVisitorAge(int visitorAge) {
        this.visitorAge = visitorAge;
    }

    public Visitor(String visitorName, int visitorAge) {
        this.visitorName = visitorName;
        this.visitorAge = visitorAge;
    }

    public Visitor() {
    }
}
