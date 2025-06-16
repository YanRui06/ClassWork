package com.apiClass.Study250605.ClassText250607;

public class DangerException  {

    String message = "Danger Exception";

    public void show(){
        System.out.println(message);
    }

    public DangerException() {
    }

    public DangerException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
