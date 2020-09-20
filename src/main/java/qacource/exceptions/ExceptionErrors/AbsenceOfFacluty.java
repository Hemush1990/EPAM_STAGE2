package qacource.exceptions.ExceptionErrors;

public class AbsenceOfFacluty extends Exception{
    public AbsenceOfFacluty(String message){
        super("There aren't any faculties");
    }
}
