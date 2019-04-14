package lr1.Exception;
import lr1.*;

public class ExceptionCardNumber extends Exception {
    public ExceptionCardNumber(){}
    @Override
    public String getMessage(){
        return "Invalid card number.\nEnter another number\n";
    }
}
