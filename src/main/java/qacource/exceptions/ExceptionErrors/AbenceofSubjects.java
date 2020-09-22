package qacource.exceptions.ExceptionErrors;

public class AbenceofSubjects extends Exception{
    public AbenceofSubjects(){
        super("There aren't any subjects");
    }

    public AbenceofSubjects(String message){
        super(message);
    }
}
