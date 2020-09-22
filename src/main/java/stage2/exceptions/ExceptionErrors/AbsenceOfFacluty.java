package stage2.exceptions.ExceptionErrors;

public class AbsenceOfFacluty extends Exception{
    public AbsenceOfFacluty(){
        super("There aren't any faculties");
    }
    public AbsenceOfFacluty(String message){
        super(message);
    }
}
