package osselin.alexandre.Exercice1and2;

import java.util.ArrayList;

public class Bank {

    private static ArrayList<Customer> customers;
    private static ArrayList<CurrentAccount>  managedCurrentAccount;
    private static ArrayList<SavingAccount>  managedSavingAccount;
    private String name;

     /* Specific rules could be applied to this class depending on the nature of the Bank :
     *  A bank could be a hedge fund, meaning that it will managed only specific account of clients (only savings accounts for instance),
     *
     * If the bank is only a retail bank, the "AddCustomer" could automatically add to the managedAccount array list the accounts of the given client
     *
     * We assume here that the bank is a retail bank
     */

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
        managedCurrentAccount = new ArrayList<>();
        managedSavingAccount = new ArrayList<>();
    }



    public void addCustomer(Customer c){
        customers.add(c);
    }

    public void SetAccounttoManagement(Customer a){

        if(customers.contains(a)) {

            if(a.getSavingsaccounts() != null){
            for(SavingAccount sa : a.getSavingsaccounts()){
                if(!managedSavingAccount.contains(sa)){
                    managedSavingAccount.add(sa);
                }
            }
            }
            if(!managedCurrentAccount.contains(a.getCurrentAccount()))
                managedCurrentAccount.add(a.getCurrentAccount());


        }else{
            System.out.println("Please use addCustomer first to add the client to the database.");
        }
    }

    @Override
    public String toString() {
        String s = "Bank : "  + name;
        s += "\n" + "=======================" + "\n";
        s += "List of Customers : \n";
        for(Customer c : customers){
            s += c.getName() +", ";
        }
        s += "\n" + "=======================" + "\n";
        s += "List of managed Current Account : \n";
        for(CurrentAccount a : managedCurrentAccount){
            s += a.getAccountID() +", ";
        }
        s += "\n" + "=======================" + "\n";
        s += "List of managed Saving Account : \n";
        for(SavingAccount a : managedSavingAccount){
            s += a.getAccountID() + ", ";
        }

        return s;
    }
}
