package lr1.CustomerClasses;

import java.io.*;
public class Customer implements Serializable{
    private String name;
    private String surname;
    private String patronymic;
    private String adress;
    private String cardNumber;
    private String bankNumber;

    public Customer (){
        this.name=null;
        this.surname=null;
        this.patronymic=null;
        this.adress=null;
        this.cardNumber=null;
        this.bankNumber=null;
    }
    public Customer(String name,String surname,String patronymic,String adress,String cardNumber,String bankNumber){
        this.name=name;
        this.surname=surname;
        this.patronymic=patronymic;
        this.adress=adress;
        this.cardNumber=cardNumber;
        this.bankNumber=bankNumber;
    }
   /* public Customer( Customer newCust){
        this. Customer(newCust.getName(),newCust.getSurname(), newCust.getPatronymic(),newCust.getAdress(),newCust.getCardNumber(),newCust.getBankNumber());
    }*/
   public String getName(){
        return name;
   }
   public String getSurname(){
        return surname;
   }
   public String getPatronymic(){
        return patronymic;
   }
   public String getAdress(){
        return adress;
   }
   public String getCardNumber(){
        return cardNumber;
   }
   public String getBankNumber(){
        return bankNumber;
   }

   public void setName(String name){
        this.name=name;
   }
   public void setSurname(String surname){
        this.surname=surname;
    }
   public void setPatronymic(String patronymic){
        this.patronymic=patronymic;
    }
   public void setAdress(String adress){
        this.adress=adress;
    }
   public void setCardNumber(String cardNumber){
       this.cardNumber=cardNumber;
   }
   public void setBankNumber(String bankNumber){
        this.bankNumber=bankNumber;
   }

   public String toString(){
        return String.format("%20s%15s%20s%35s%20s%12s%n\n",this.name, this.surname, this.patronymic , this.adress, this.cardNumber, this.bankNumber);
   }
}
