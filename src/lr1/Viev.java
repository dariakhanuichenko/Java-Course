package lr1;
import lr1.*;

public class Viev {


    public  void showCustomerCollection(CustomerCollection custCollection){
        if(custCollection.getNumberOfCustomers()!=0){
            System.out.print("        Surname     |      Name     |     Patronimyc     |               Adress              |       Card№       |   Bank№   |\n");
            System.out.print("____________________ _______________ ____________________ ___________________________________ ____________________ ____________\n");
            for(int i=0;i<custCollection.getNumberOfCustomers();i++){
                 System.out.printf("%20s|%15s|%20s|%35s|%20s|%12s|%n",custCollection.getCustomer(i).getSurname(),custCollection.getCustomer(i).getName(),custCollection.getCustomer(i).getPatronymic(),custCollection.getCustomer(i).getAdress(),custCollection.getCustomer(i).getCardNumber(),custCollection.getCustomer(i).getBankNumber());
             }
            System.out.print("____________________ _______________ ____________________ ___________________________________ ____________________ ____________\n");
        }
    }
}
