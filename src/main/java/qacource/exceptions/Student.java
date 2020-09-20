package qacource.exceptions;

public class Student extends Group {
    private String name;
    private String surname;
    private Disciplines disciplines;
    private int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Disciplines getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Disciplines disciplines) {
        this.disciplines = disciplines;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }


    public Student(String facultyName, String groupName, String name, String surname, Disciplines disciplines, int mark) {
        super(facultyName, groupName);
        this.name = name;
        this.surname = surname;
        this.disciplines = disciplines;
        this.mark = mark;
    }
}









