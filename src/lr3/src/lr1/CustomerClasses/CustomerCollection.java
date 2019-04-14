package lr1.CustomerClasses;

import java.io.*;

public class CustomerCollection implements Serializable{
    private int numberOfCustomers;
    private Customer[] customer;

public CustomerCollection(){
    this.numberOfCustomers = 0;
    this.customer = new Customer[10];
}
    public CustomerCollection(int n ) {
        this.numberOfCustomers = n;
        this.customer = new Customer[10];
        this.customer[0] = new Customer("Irina", "Petrova", "Vladimirovna", "Kyiv,Podol", "1212323212123232", "5555555555");
        this.customer[1] = new Customer("Aleksandr", "Zhuk", "Viktorovich", "Lvov,Postal_Square", "9999888877776666", "1212121212");
        this.customer[2] = new Customer("Marina", "Tyshchenko", "Igorovna", "Lutsk_Lenina_street", "5555666644441111", "7125613458");
        this.customer[3] = new Customer("Roman", "Kolisnyi", "Aleksandrovich", "Odessa,Deribasovskayastreet", "3333222211114444", "9854756215");
        this.customer[4] = new Customer("Benedict", "Cumberbatch", "Carlton", "London,city", "9999111199991111", "0000111100");
        this.customer[5] = new Customer("Martin", "Freeman", "Bob", "Amsterdam,st_street", "1111999911119999", "1457265489");
    }

    public int getNumberOfCustomers() {
        return this.numberOfCustomers;
    }

    public Customer[] getCustomerCollection() {
        return this.customer;
    }

    public Customer getCustomer(int i) {
        return this.customer[i];
    }

    public void setNumberOfCustomers(int number) {
        this.numberOfCustomers = number;
    }

    public void setCustomer(Customer customer, int i) {
        this.getCustomer(i).setSurname(customer.getSurname());
        this.getCustomer(i).setName(customer.getName());
        this.getCustomer(i).setPatronymic(customer.getPatronymic());
        this.getCustomer(i).setAdress(customer.getAdress());
        this.getCustomer(i).setCardNumber(customer.getCardNumber());
        this.getCustomer(i).setBankNumber(customer.getBankNumber());
    }

    public void addCustomer(Customer newCustomer) {
    try{
        if (this.numberOfCustomers < this.customer.length) {
                this.numberOfCustomers++;
                this.customer[this.numberOfCustomers - 1] = new Customer();//newCustomer.getName(),newCustomer.getSurname(),newCustomer.getPatronymic(),newCustomer.getAdress(),newCustomer.getCardNumber(),newCustomer.getBankNumber());
                this.setCustomer(newCustomer,numberOfCustomers-1);
            } else throw new IndexOutOfBoundsException("The array is full!");
        } catch(IndexOutOfBoundsException ee){
        System.out.println("The array is full!");
        }
    }

    public void swap(int i, int j) {
        Customer temp = new Customer(this.getCustomer(i).getName(), this.getCustomer(i).getSurname(), this.getCustomer(i).getPatronymic(), this.getCustomer(i).getAdress(), this.getCustomer(i).getCardNumber(), this.getCustomer(i).getBankNumber());
       this.setCustomer(this.getCustomer(j),i);
       this.setCustomer(temp,j);
    }
}
