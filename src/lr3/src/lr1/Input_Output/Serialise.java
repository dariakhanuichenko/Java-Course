package lr1.Input_Output;

import lr1.CustomerClasses.Customer;
import lr1.CustomerClasses.CustomerCollection;

import java.io.*;

public class Serialise {
    public void Serialisation(String fileName, CustomerCollection cust)
            throws IOException {
        if(cust.getNumberOfCustomers()>0 ){
            //try(ObjectOutputStream fw= new ObjectOutputStream(new FileOutputStream(fileName));){
            ObjectOutputStream fw= new ObjectOutputStream(new FileOutputStream(fileName));
            for(int i=0; i<cust.getNumberOfCustomers(); i++){
                fw.writeObject(cust.getCustomer(i));
            }
            fw.close();
        }
    }
    public void ReadSerialisation(String fileName, CustomerCollection cust)
            throws FileNotFoundException,IOException, ClassNotFoundException{
        if(cust.getNumberOfCustomers()<=10 ){
            ObjectInputStream fw= new ObjectInputStream(new FileInputStream(fileName));
            //if(fw!=null){
            Customer c;
               do{
                    //int z=fw.available();
                    cust.addCustomer((Customer)fw.readObject());

                }while(fw.available()>=0);
            //}
            fw.close();

        }
    }
}
