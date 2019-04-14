package lr1;
import lr1.CustomerClasses.CustomerCollection;

public class View {

    public void showTextMenu(){
        System.out.print("\n    HELLO USER!    \n1. Create a list of customers automatically.\n2.Create a list of customers by yourself.");
        System.out.print("\n3.Show Customers collection.\n4.Sort and output  customer list by the alphabet.\n5.Show customers, that have Card number in Diaphazone\n6.Read customers from the file\n7.Write customers to the file\n8.Serialise objects to the file\n9.Deserialise objects to the file\n0.Exit.\n \n choose a number  please:\n");

    }

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
