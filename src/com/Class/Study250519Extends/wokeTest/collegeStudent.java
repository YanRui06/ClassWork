package com.Class.Study250519Extends.wokeTest;

public class CollegeStudent extends Student {
    private String domain;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CollegeStudent(String sno, String name, String domain) {
        super(sno, name);
        this.domain = domain;
    }

    public void CollegeStudent() {

    }
}
