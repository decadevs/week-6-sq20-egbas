package org.example.model;

public class Books {
    private String bookName;
    private String authorName;
    private int serialNo;
    private int numberOfBooks;

    public Books(String bookName, String authorName, int serialNo, int numberOfBooks) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.serialNo = serialNo;
        this.numberOfBooks = numberOfBooks;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
}
