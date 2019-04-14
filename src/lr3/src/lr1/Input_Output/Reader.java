package lr1.Input_Output;
import lr1.CustomerClasses.Customer;
import lr1.CustomerClasses.CustomerCollection;
import lr1.Exception.ExceptionBigSizeArray;
import lr1.Exception.ExceptionCardNumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {
    public void readFromKeebord(CustomerCollection cust) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print("Enter number of Customers, which you want to add: ");
            try {
                  number = Integer.parseInt(scan.nextLine());

            if (number > 0 && number<=10) {
                for (int i = 0; i < number; i++) {
                    System.out.print("\nAdd information\n");
                    System.out.print("Surname:");
                    String surname = scan.nextLine();
                    System.out.print("Name:");
                    String name = scan.nextLine();
                    System.out.print("Patronymic:");
                    String patronymic = scan.nextLine();
                    System.out.print("Adress:");
                    String adress = scan.nextLine();
                    System.out.print("Card Number:");
                    String nCard = ValidationNumbers( 16, "\\d{16}");
                    System.out.print("Number Bank:");//******************************
                    String nBank = ValidationNumbers(10,"\\d{10}");
                    cust.addCustomer(new Customer(name, surname, patronymic, adress, nCard, nBank));

                }return;
            }else throw new ExceptionBigSizeArray();
        }catch (NumberFormatException e) {
            System.out.print("Invalid input\n");
        }catch(ExceptionBigSizeArray ee){
                System.out.println("Too big size!");
            }
        }while(true);
    }

    public String InputFileName(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nFile name:");
        return  scan.nextLine();
    }

    public String ValidationNumbers( int len, String mode) {
         Scanner scan = new Scanner(System.in);
         String  card ;
         do{
             System.out.print("\nNumber:");
             card = scan.nextLine();
            try {
                ExCardNumber(card,len,mode);
                return card;
            } catch (ExceptionCardNumber ee) {
                System.err.println(ee.getMessage());
            }
         }while(true);
        //return card;
    }

    public static boolean checkNumCard(String cardNum, String mode) {
        Pattern p = Pattern.compile(mode);
        Matcher m = p.matcher(cardNum);
        return m.matches();
    }

    public boolean ExCardNumber(String card, int len, String mode)
        throws ExceptionCardNumber {
        if (card.length() != len || !checkNumCard(card,mode)) {
            throw new ExceptionCardNumber();
        }
        return true;
    }
}