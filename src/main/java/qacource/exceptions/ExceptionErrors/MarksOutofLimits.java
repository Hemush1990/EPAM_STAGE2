package qacource.exceptions.ExceptionErrors;

public class MarksOutofLimits extends Exception{
    public MarksOutofLimits(){
        super("The mark is out of limit");
    }

    public MarksOutofLimits(String message){
        super(message);
    }
}
