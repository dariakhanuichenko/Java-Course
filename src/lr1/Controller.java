package lr1;
import lr1.*;
import java.util.Scanner;

public class Controller {
    private Model model;
    private Viev viev;
    private Reader read;

    public Controller(){
        viev=new Viev();
        model=new Model();
        read=new Reader();
    }


    public void showTextMenu(){
        System.out.print("    HELLO USER!    \n choose a number  please:\n 1. Create a list of customers automatically.\n2.Create a list of customers by yourself.");
        System.out.print("\n3.Show Customers collection.\n4.Sort and output  customer list by the alphabet.\n5.Show customers, that have Card number in Diaphazone\n0.Exit.");

    }

     public void showMenu(){

        Scanner scan = new Scanner(System.in);
         CustomerCollection customer=null;
         char key=0, key1=0;
          do{
              this.showTextMenu();
              key=scan.next().charAt(0);
              switch(key){
                  case '1':  customer=new CustomerCollection(1);
                  System.out.print("Customer collection was created automatically!");
                  break;
                  case '2': customer=new CustomerCollection();
                            read.readFromKeebord(customer);
                            System.out.print("The  customer collection was created by yourself");
                  break;
                  case '3':
                      if( customer!=null)
                      viev.showCustomerCollection(customer);
                    else
                      System.out.print("Customer collection doesn't exist!");
                  break;
                  case '4':
                      if( customer!=null)
                          viev.showCustomerCollection(model.sortBySurname(customer));
                      else
                          System.out.print("Customer collection doesn't exist!");
                      break;
                  case '5':
                      if( customer!=null){
                          System.out.print("x1:");
                          scan.nextLine();
                          String x1 = scan.nextLine();
/*
                          if(x1.length() != 16) {
                              while (x1.length() != 16) {
                                  System.out.print("Invalid Number, write another Number\n  Number:");
                                  x1 = scan.nextLine();
                              }
                          }*/
                              read.ValidationNumbers(x1,16);
                          System.out.print("\nx2:");
                          String x2 = scan.nextLine();
                          //if(x2.length() != 16) {
                             // Scanner scan = new Scanner(System.in);
                              /*while (x2.length() != 16) {
                                  System.out.print("Invalid Number, write another Number\n  Number:");
                                  x2 = scan.nextLine();
                              }
                          }*/read.ValidationNumbers(x2,16);
                          viev.showCustomerCollection(model.customerCollectionByCardNumber(customer, x1,x2));
                      }
                      else
                      System.out.print("Customer collection doesn't exist!");
                      break;
              }
              System.out.print("\nchoose a number:\n");
          }while(key!='0');
     }
     public String toString (CustomerCollection custCol, int number){
        String str= custCol.getCustomer(number).getSurname()+custCol.getCustomer(number).getName()+custCol.getCustomer(number).getPatronymic()+custCol.getCustomer(number).getAdress()+custCol.getCustomer(number).getCardNumber()+custCol.getCustomer(number).getBankNumber();
        return str;
    }

}