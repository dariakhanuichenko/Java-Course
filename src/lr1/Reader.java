package lr1;
import lr1.*;
import java.util.Scanner;

public class Reader {
    public void readFromKeebord(CustomerCollection cust){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of Customers, which you want to add: ");
        int number=scan.nextInt();
        scan.nextLine();
        if(number>0){
            for(int i=0;i<number;i++) {
                System.out.print("Surname:");
                String surname = scan.nextLine();
                System.out.print("Name:");
                String name = scan.nextLine();
                System.out.print("Patronymic:");
                String patronymic = scan.nextLine();
                System.out.print("Adress:");
                String adress = scan.nextLine();
                System.out.print("Number Card:");
                String nCard = scan.nextLine();
                this.ValidationNumbers(nCard,16);
                System.out.print("Number Bank:");
                String nBank=scan.nextLine();
                this.ValidationNumbers(nBank,10);
                cust.addCustomer(new Customer(name,surname,patronymic,adress,nCard,nBank));
            }
        }
    }

    public String ValidationNumbers(String  card,int len){

        if(card.length() != len) {
            Scanner scan = new Scanner(System.in);
            while (card.length() != len) {
                System.out.print("Invalid Number, write another Number\n  Number:");
                card = scan.nextLine();
            }
        }
        return card;
    }
}
