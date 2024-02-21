package org.example.model;


public class Person {
    private String name;

    private int ID;

    private boolean isTeacher;
    private boolean isJunior;
    private boolean isSenior;

    public Person(String name, int ID, boolean isTeacher, boolean isJunior, boolean isSenior) {
        this.name = name;
        this.ID = ID;
        this.isTeacher = isTeacher;
        this.isJunior = isJunior;
        this.isSenior = isSenior;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public boolean isTeacher() {
        return isTeacher;
    }

    public boolean isJunior() {
        return isJunior;
    }

    public boolean isSenior() {
        return isSenior;
    }
}
