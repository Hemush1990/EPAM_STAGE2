package com.epam.learning.MainTask2;

public class StudentsRunner {
    public static void main(String[] args) {
        Student Johnson = new Student(67686, "Johnson", "Samuel", "Peter", "20.01.1999", "New York", "Linguistic", "3749999", "first", "333");
        Student Petrov = new Student(1111, "Petrov", "Samy", "Ivanovich", "23.05.1996", "Moscow", "Economy", "7788203", "second", "565");
        Student Petrosyan = new Student(67686, "Petrosyan", "Evgeniy", "Adamovich", "04.07.1997", "Yerevan", "Linguistic", "374889999", "third", "333");

        Actions newlist = new Actions();
        newlist.addStudent(Johnson);
        newlist.addStudent(Petrov);
        newlist.addStudent(Petrosyan);

        newlist.faculty("Linguistic");
        newlist.courses("Economy", "second");
        newlist.birthday("1995");
        newlist.group("333");
    }
}
