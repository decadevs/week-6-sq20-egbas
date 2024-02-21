package org.example.model;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>  {

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.isTeacher() && !p2.isTeacher()){
            return -1;
        } else if (!p1.isTeacher() && p2.isTeacher()){
            return 1;
        } else if (p1.isSenior() && !p2.isSenior()){
            return -1;
        } else if (!p1.isSenior() && p2.isSenior()){
            return 1;
        }
        return 0;
    }
}
