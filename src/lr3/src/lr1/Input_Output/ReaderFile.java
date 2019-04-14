package lr1.Input_Output;

import java.io.*;


import lr1.CustomerClasses.Customer;
import lr1.CustomerClasses.CustomerCollection;


public class ReaderFile {

    public void ReadFile(String fileName, CustomerCollection cust)
       throws FileNotFoundException,IOException{
           FileInputStream fr= new FileInputStream(fileName);
           BufferedReader br = new BufferedReader(new InputStreamReader(fr));

            String [] tempString= new String[6];
            String line;
            int i=0;
                while((line = br.readLine()) != null){
                    //line = br.readLine();
                    for (String retval : line.split(" ")) {
                    tempString[i]=retval;
                        i++;
                    if(i==6){
                        WriteCust(cust, tempString);
                        i=0;
                    }
                    }
                }
                fr.close();
    }


    public void WriteCust(CustomerCollection cust,String[] tempString)
    {
        cust.addCustomer(new  Customer(tempString[0],tempString[1],tempString[2],tempString[3],tempString[4],tempString[5]));
    }


    public void WriteFile(String fileName, CustomerCollection cust) {
        if (cust.getNumberOfCustomers() != 0) {
            try (FileWriter fw = new FileWriter(fileName)) {
                for (int i = 0; i < cust.getNumberOfCustomers(); i++) {
                    String toWrite = String.format("%s %s %s %s %s %s%n", cust.getCustomer(i).getName(), cust.getCustomer(i).getSurname(), cust.getCustomer(i).getPatronymic(),cust.getCustomer(i).getAdress(), cust.getCustomer(i).getCardNumber(),cust.getCustomer(i).getBankNumber());
                    fw.write(toWrite);
                }
            } catch (Exception ex) {
                System.out.println("ERROR!!!!!");
            }
        }
    }
}

