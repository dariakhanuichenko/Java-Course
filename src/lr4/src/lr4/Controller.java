package lr4;

import java.util.InputMismatchException;
import java.util.LinkedList;

public class Controller {
    private Model model;
    private View view;
    private Reader reader;

    public Controller(){
        model=new Model();
        view=new View();
        reader=new Reader();
    }

    public int ValidateSize(){
        while(true){
            try{
                return reader.GetSizeMatrix();
            }catch (NumberFormatException e){
            System.out.print("Invalid input. You should enter integer.\n");
            }
        }
    }

    public void Program(){
        int size=0;
        while(size==0){
            size = ValidateSize();}
            LinkedList<Integer> matrix1 = model.createList(size);
            System.out.print("    RANDOM\n    M1:");
            view.PrintMatrix(matrix1, size);

            LinkedList<Integer> matrix2 = model.createList(size);
            System.out.print("    M2:");
            view.PrintMatrix(matrix2, size);

            LinkedList<Integer> multiplication = model.Multiply(matrix1, matrix2, size);
            System.out.print("     Multiplication:");
            view.PrintMatrix(multiplication, size);

            LinkedList<Integer> sum = model.Sum(matrix1, matrix2, size);
            System.out.print("    Suma:");
            view.PrintMatrix(sum, size);

    }

}
