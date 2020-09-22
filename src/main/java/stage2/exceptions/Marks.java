package stage2.exceptions;

import stage2.exceptions.ExceptionErrors.*;

import java.util.List;

public class Marks {
    private List<Student> student;
    private int mark;
    private float averageMark;
    private Disciplines disciplines;
    public String StudentName;
    public Faculty faculty;


    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }


    public Marks(List<Student> student) {
        this.student = student;
    }


    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }


    public void checkMarks(int mark) throws MarksOutofLimits, AbsenceofStudent {
        checkStudentExictense();

        if ((mark < 0) || (mark > 10)) {
            throw new MarksOutofLimits("The mark is out of limit");
        }
    }

    public float getAverageMark() throws MarksOutofLimits, AbsenceofStudent {
        int allMarks = 0;
        checkMarks(mark);
        for (Student student : student) {
            mark += student.getMark();
            allMarks++;
        }
        averageMark = mark / allMarks;
        return averageMark;
    }

    public void getAverageNarkForSubjects() throws MarksOutofLimits, AbsenceofStudent {
        float averageLing = 0;
        float averageFLit = 0;
        float averageRLit = 0;
        int allMarks = 0;
        checkMarks(mark);

        if (disciplines == Disciplines.FOREIGN_LITERATURE) {
            mark += getMark();
            allMarks++;

            averageFLit = mark / allMarks;
            System.out.println("Средний балл по Зарубежной Литературе: " + averageFLit);
        } else if (disciplines == Disciplines.RUSSIAN_LITERATURE) {
            mark += getMark();
            allMarks++;

            averageRLit = mark / allMarks;
        } else {
            mark += getMark();
            allMarks++;

            averageLing = mark / allMarks;

        }
        System.out.println("Средний балл по Лингвистике: " + averageLing);
        System.out.println("Средний балл по Русской Литературе: " + averageRLit);
        System.out.println("Средний балл по Зарубежной Литературе: " + averageFLit);


    }

    public void getAverageSpecificGroup() throws MarksOutofLimits, AbsenceofStudent, AbsenceOfFacluty, AbsenceOfGroup, AbenceofSubjects {
        int allmarks = 0;
        checkMarks(mark);
        checkGroupinFaculty();
        checkSubjectExistense();
        for (Student student : student) {
            if (disciplines == Disciplines.RUSSIAN_LITERATURE) {
                if (student.getGroupName().equals("Литература")) {
                    if (student.getFacultyName().equals("Русская Филология")) {
                        mark += student.getMark();
                        allmarks++;
                    }
                    averageMark = mark / allmarks;

                }
            }
        }
        System.out.println("Средний балл в факультете Русской Филологии группы Литература по предмету Русская Литература: " + averageMark);
    }


    public String checkStudentExictense() throws AbsenceofStudent {
        for (Student student : student) {
            if (student.getName().isEmpty()) {
                throw new AbsenceofStudent("Please enter a valid Student name");
            }
            if (student.getSurname() == null) {
                throw new AbsenceofStudent("Please enter a valid Student name");
            }
            if (student.getGroupName() == null) {
                throw new AbsenceofStudent("Please enter a valid Student name");
            } else {
                StudentName = student.getName() + student.getSurname();
            }
        }
        return StudentName;
    }

    public Disciplines checkSubjectExistense() throws AbenceofSubjects {
        for (Student student : student) {
            if (student.getDisciplines() == Disciplines.FOREIGN_LITERATURE) {
                return disciplines;
            } else if (student.getDisciplines() == Disciplines.LINGUISTIC) {
                return disciplines;
            } else if (student.getDisciplines() == Disciplines.RUSSIAN_LITERATURE) {
                return disciplines;
            } else {
                throw new AbenceofSubjects("There aren't such subjects for student");
            }


        }
        return disciplines;
    }

    public String checkGroupinFaculty() throws AbsenceOfFacluty, AbsenceOfGroup {
        String facultyName = null;
        String groupName;
        for (Student student : student) {
            if (student.getFacultyName().isEmpty()) {
                throw new AbsenceOfFacluty("There isn't such faculty");
            } else {
                facultyName = student.getFacultyName();
                groupName = student.getGroupName();
            }
            if (student.getGroupName() == null) {
                throw new AbsenceOfGroup("There isn't such group");
            } else {
                facultyName = student.getFacultyName();
                groupName = student.getGroupName();
            }

        }
        return facultyName;
    }


}


