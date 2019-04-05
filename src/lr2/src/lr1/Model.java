package lr1;
import lr1.*;

public class Model {

    public CustomerCollection sortBySurname(CustomerCollection customerArr){
         for (int i=0;i<customerArr.getNumberOfCustomers()-1;i++){
             for(int j=0;j<customerArr.getNumberOfCustomers()-i-1;j++){
                if(customerArr.getCustomer(j).getSurname().compareTo(customerArr.getCustomer(j+1).getSurname())>0){

                    customerArr.swap(j,j+1);
                 }
             }
         }
        return customerArr;
    }
    public CustomerCollection  customerCollectionByCardNumber( CustomerCollection customerArr, String cardNumFirst,String cardNumSecond){
        CustomerCollection tempCollection=new CustomerCollection();
        if( cardNumFirst.compareTo(cardNumSecond)>0) {
            String tempcard = cardNumSecond;
            cardNumSecond = cardNumFirst;
            cardNumFirst = tempcard;
        }

        for (int i=0;i<customerArr.getNumberOfCustomers();i++){
            if( customerArr.getCustomer(i).getCardNumber().compareTo(cardNumFirst)>0 && customerArr.getCustomer(i).getCardNumber().compareTo(cardNumSecond)<0 )
             tempCollection.addCustomer(customerArr.getCustomer(i));
        }
        return tempCollection;
    }


}
