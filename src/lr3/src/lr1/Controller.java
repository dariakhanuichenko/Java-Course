package lr1;

import lr1.CustomerClasses.CustomerCollection;
import lr1.Input_Output.Reader;
import lr1.Input_Output.ReaderFile;
import lr1.Input_Output.Serialise;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Controller {
    private Model model;
    private View view;
    private Reader read;
    private ReaderFile readFile;
    private Serialise serialise;

    public Controller(){
        view =new View();
        model=new Model();
        read=new Reader();
        readFile=new ReaderFile();
        serialise=new Serialise();
    }




     public void showMenu(){

        Scanner scan = new Scanner(System.in);
         CustomerCollection customer=null;
         char key=0, key1=0;
          do{
              view.showTextMenu();
              key=scan.next().charAt(0);
              switch(key){
                  case '1':  customer=new CustomerCollection(6);
                  System.out.print("Customer collection was created automatically!");
                  break;
                  case '2': customer=new CustomerCollection();
                            read.readFromKeebord(customer);
                            System.out.print("The  customer collection was created by yourself");
                  break;
                  case '3':
                      if( customer!=null)
                      view.showCustomerCollection(customer);
                    else
                      System.out.print("Customer collection doesn't exist!");
                  break;
                  case '4':
                      if( customer!=null)
                          view.showCustomerCollection(model.sortBySurname(customer));
                      else
                          System.out.print("Customer collection doesn't exist!");
                      break;
                  case '5':
                      if( customer!=null){
                          System.out.print("x1:");
                          String x1 = read.ValidationNumbers(16, "\\d{16}");
                          System.out.print("\nx2:");
                          String x2 = read.ValidationNumbers(16, "\\d{16}");
                          System.out.print("\nThat's all Customers:");
                          view.showCustomerCollection(model.customerCollectionByCardNumber(customer, x1,x2));
                      }
                      else
                      System.out.print("Customer collection doesn't exist!");
                      break;
                  case '6':
                      //if( customer==null)
                          customer = new CustomerCollection();
                      try{
                      readFile.ReadFile("3.txt"/*read.InputFileName()*/, customer);
                      System.out.print("Customer collection was red from the file!");
                      }catch (FileNotFoundException ex) {
                          System.out.println("File not found!");
                      }catch (IOException ee){
                          System.out.println("Error!");
                      }
                      break;
                  case '7':
                      if( customer==null)
                          customer = new CustomerCollection();

                            readFile.WriteFile("3.txt"/*read.InputFileName()*/, customer);
                            System.out.print("Customer collection was wrote to the file!");

                      break;

                  case '8':
                      if( customer==null)
                          customer = new CustomerCollection(6);
                      try {
                          serialise.Serialisation("1.dat"/*read.InputFileName()*/, customer);
                          System.out.print("Customer collection was serialised to the file!");
                      }catch (IOException ex){
                          System.out.println("ERROR!!!!!");
                      }
                        break;
                  case '9':
                      if( customer==null)
                          customer = new CustomerCollection();
                      try {
                          serialise.ReadSerialisation("1.dat"/*read.InputFileName()*/, customer);
                          System.out.print("Customer collection was deserialised to the file!");
                      }catch (FileNotFoundException ex) {
                          System.out.println("File not found!");
                      }catch (ClassNotFoundException e) {
                          System.out.println("Class was not found!!!");
                      }catch (IOException ex){
                      }
                      break;
              }

          }while(key!='0');
     }
}