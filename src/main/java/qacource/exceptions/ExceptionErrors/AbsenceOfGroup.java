package qacource.exceptions.ExceptionErrors;

public class AbsenceOfGroup extends Exception{
    public AbsenceOfGroup(String message){
        super("There aren't any groups");
    }
}
