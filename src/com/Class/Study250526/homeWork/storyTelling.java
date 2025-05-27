package com.Class.Study250526.homeWork;

public class storyTelling {
    private String storyName;
    private String tellPeople;

    public String getStoryName() {

        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

    public String getTellPeople() {
        return tellPeople;
    }

    public void setTellPeople(String tellPeople) {
        this.tellPeople = tellPeople;
    }

    public storyTelling(String storyName, String tellPeople) {
        this.storyName = storyName;
        this.tellPeople = tellPeople;
    }

    public storyTelling() {
    }
}
