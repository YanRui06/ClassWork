package com.apiClass.Study250609.ClassWork;

import java.time.LocalDateTime;

public class Schedule {
    private String title;
    private LocalDateTime dateTime;


    public Schedule() {
    }

    public Schedule(String title, LocalDateTime dateTime) {
        this.title = title;
        this.dateTime = dateTime;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

}