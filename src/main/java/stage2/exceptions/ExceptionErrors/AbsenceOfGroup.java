package stage2.exceptions.ExceptionErrors;

public class AbsenceOfGroup extends Exception{
    public AbsenceOfGroup(){
        super("There aren't any groups");
    }
    public AbsenceOfGroup(String message){
        super(message);
    }
}
