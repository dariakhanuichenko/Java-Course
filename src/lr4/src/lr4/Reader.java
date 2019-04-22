package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader {

    public int GetSizeMatrix()
    {
            System.out.println("Enter a matrix size: ");
            Scanner scan = new Scanner(System.in);

                int n = Integer.parseInt(scan.next());
                 if(n==0)
                     System.out.println("The size is notnull");
                 if(n<0)
                System.out.println("Negative number\n The size will be (-1) *("+n+") = "+Math.abs(n));
            return (n<0)? Math.abs(n):n;


     }
}
