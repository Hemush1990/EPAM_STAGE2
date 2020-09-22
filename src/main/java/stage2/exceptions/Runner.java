package stage2.exceptions;

import stage2.exceptions.ExceptionErrors.*;

import java.util.Arrays;
import java.util.List;

public class Runner {


    static List<Student> students = Arrays.asList(
            new Student("Русская Филология", "Языкова", "Катерина", "Летникова", Disciplines.FOREIGN_LITERATURE, 8),
            new Student("Русская лингвистика", "Литература", "Анастасия", "Светина", Disciplines.LINGUISTIC, 5),
            new Student("Русская Филология", "Языковая", "Сергей", "Петров", Disciplines.RUSSIAN_LITERATURE, 7),
            new Student("Русская лингвистика", "Языковая", "Петр", "Васильев", Disciplines.FOREIGN_LITERATURE, 8),
            new Student("Русская Филология", "Литература", "Александр", "Пушкин", Disciplines.RUSSIAN_LITERATURE, 9),
            new Student("Русская лингвистика", "Литература", "Елена", "Лапина", Disciplines.FOREIGN_LITERATURE, 4),
            new Student("Русская Филология", "Языковая", "Фёдор", "Ковалев", Disciplines.LINGUISTIC, 7),
            new Student("Русская лингвистика", "Литература", "Михаил", "Лермонтов", Disciplines.RUSSIAN_LITERATURE, 5));


    public static void main(String[] args) {
        float averageMark = 0;
        Marks mark = new Marks(students);

        try {
            averageMark = mark.getAverageMark();
            mark.getAverageNarkForSubjects();
            mark.getAverageSpecificGroup();
        } catch (AbsenceofStudent absenceofStudent) {
            absenceofStudent.printStackTrace();
        } catch (MarksOutofLimits marksOutofLimits) {
            marksOutofLimits.printStackTrace();
        } catch (AbenceofSubjects abenceofSubjects) {
            abenceofSubjects.printStackTrace();
        } catch (AbsenceOfFacluty absenceOfFacluty) {
            absenceOfFacluty.printStackTrace();
        } catch (AbsenceOfGroup absenceOfGroup) {
            absenceOfGroup.printStackTrace();
        }
        System.out.println("Средний балл студента " + students + averageMark);

    }

}

