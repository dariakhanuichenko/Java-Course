package lr1.Exception;
import lr1.*;

public class ExceptionBigSizeArray extends Exception {
    public ExceptionBigSizeArray(){}
    @Override
    public String getMessage(){
        return "Input number of customers is too big\n";
    }
}
