package qacource.exceptions.ExceptionErrors;

public class MarksOutofLimits extends Exception{
    public MarksOutofLimits(String message){
        super("The mark is out of limit");
    }
}