package qacource.exceptions.ExceptionErrors;

public class AbsenceofStudent extends Exception{
    public AbsenceofStudent(String message){
        super("There aren't students in the group");
    }
}
