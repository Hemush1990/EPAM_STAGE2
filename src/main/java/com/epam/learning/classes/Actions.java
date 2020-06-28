package com.epam.learning.classes;

import java.util.ArrayList;
import java.util.List;

public class Actions extends Student {
    private final List<Student> actions = new ArrayList<>();

    public Actions(
            int id,
            String surname,
            String name,
            String patronymic,
            String birthdate,
            String address,
            String faculty,
            String phoneNumber,
            String course,
            String group) {
        super(id, surname, name, patronymic, birthdate, address, faculty, phoneNumber, course, group);
    }

    public Actions() {
        super();
    }


    public void addStudent(Student a) {
        actions.add(a);
    }

    public void faculty(String faculty) {
        System.out.println("Студенты определенного факультета");
        if (this.getFaculty(faculty).equals("Linguistic")) {
            System.out.println("\n" + getSurname() + " " + getName() + " " + getPatronymic());
        }

    }

    public void courses(String faculty, String course) {
        System.out.println("Студенты определенного факультета и курса");
        if (this.getFaculty(faculty) != null || this.getCourse(course) != null) {
            {
                System.out.println("\n" + getSurname() + getName() + getPatronymic());

            }
            throw new IllegalArgumentException("Введите корректный аргумент");
        }
    }

    public void birthday(String year) {
        System.out.println("Список студентов, родившихся после " + year + " года");
        for (Student st : actions) {
            if (parseYear(st.getBirthdate().substring(6)) > parseYear(year)) {
                System.out.println("\n" + st.toString());
            }
        }
    }

    private int parseYear(String year) {
        return Integer.parseInt(year);

    }

    public void group(String group) {
        System.out.println("Студенты учебной группы " + group);
        for (Student st : actions) {
            if (st.getGroup().equals(group)) {
                System.out.println("\n" + st.toString());
            }
        }
    }
}