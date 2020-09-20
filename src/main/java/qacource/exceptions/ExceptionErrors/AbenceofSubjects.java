package qacource.exceptions.ExceptionErrors;

public class AbenceofSubjects extends Exception{
    public AbenceofSubjects(String message){
        super("There aren't any subjects");
    }
}
