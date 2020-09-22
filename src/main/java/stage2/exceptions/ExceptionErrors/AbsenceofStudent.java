package stage2.exceptions.ExceptionErrors;

public class AbsenceofStudent extends Exception{
    public AbsenceofStudent(){
        super("There aren't students in the group");
    }

    public AbsenceofStudent(String message){
        super(message);
    }
}
