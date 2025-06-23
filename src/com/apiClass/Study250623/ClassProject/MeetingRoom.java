package com.apiClass.Study250623.ClassProject;

public class MeetingRoom {
    private String roomName;
    private int roomCapacity;
    private boolean hasMedia;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public boolean isHasMedia() {
        return hasMedia;
    }

    public void setHasMedia(boolean hasMedia) {
        this.hasMedia = hasMedia;
    }

    public MeetingRoom() {
    }

    public MeetingRoom(String roomName, int roomCapacity, boolean hasMedia) {
        this.roomName = roomName;
        this.roomCapacity = roomCapacity;
        this.hasMedia = hasMedia;
    }

    @Override
    public String toString() {
        return roomName + "\t" +
                roomCapacity + "\t\t\t" +
                (hasMedia ? "有" : "无");
    }
}
