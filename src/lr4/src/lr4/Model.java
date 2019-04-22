package lr4;

import java.util.LinkedList;
import java.lang.Math;

public class Model {

    public LinkedList<Integer> createList(int n){
        LinkedList<Integer> matrix1= new LinkedList<>();
        AddToMatrix(matrix1,n);
        return matrix1;
    }
    public void AddToMatrix(LinkedList<Integer>  matrix , int size){
        for(int i=0;i<Math.pow(size,2);i++){
            matrix.add((int)(Math.random()*4));
        }
    }
    public LinkedList<Integer> Multiply( LinkedList<Integer> m1, LinkedList<Integer> m2, int size) {

        LinkedList<Integer> m= new LinkedList<Integer>();
        int n=0;
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
            {
                n=0;
                for(int k=0;k<size;k++)
                    n+=m1.get(i*size+k)*m2.get(k*size+j);
                m.add(n);
            }
        return m;
    }

    public LinkedList<Integer>Sum( LinkedList<Integer> m1, LinkedList<Integer> m2, int size){
        LinkedList<Integer> m= new LinkedList<Integer>();
        for(int i=0;i<Math.pow(size,2);i++){
            m.add(m1.get(i)+m2.get(i));
        }
        return m;
    }
}
