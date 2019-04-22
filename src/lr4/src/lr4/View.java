package lr4;

import java.util.LinkedList;

public class View {

    public void PrintMatrix(LinkedList<Integer> matrix, int size){

        for (int i=0;i<Math.pow(size,2);i++){
            if((i)%size==0)
                System.out.print('\n');
            System.out.print(matrix.get(i)+" ");
        }
        System.out.print('\n');
    }
}
