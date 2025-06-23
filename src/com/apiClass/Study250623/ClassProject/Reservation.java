package com.apiClass.Study250623.ClassProject;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
    private MeetingRoom meetingRoom;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Reservation() {
    }

    public Reservation(MeetingRoom meetingRoom, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.meetingRoom = meetingRoom;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String toString() {
        return STR."预定时间{\{date} \{startTime}~\{endTime}}";
    }
}
