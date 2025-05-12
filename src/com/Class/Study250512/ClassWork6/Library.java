package com.Class.Study250512.ClassWork6;

public class Library {
    private int bookId;
    private String bookName;
    private double bookMoney;
    private int bookNum;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookMoney() {
        return bookMoney;
    }

    public void setBookMoney(double bookMoney) {
        this.bookMoney = bookMoney;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public Library(int bookId, String bookName, double bookMoney, int bookNum) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookMoney = bookMoney;
        this.bookNum = bookNum;
    }

    public Library() {
    }
}
