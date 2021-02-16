package osselin.alexandre.Exercice1and2;

import java.util.ArrayList;

public class Customer {

    /*
    * For this exercise, we will assume that a client can only have a single Current Account in a given bank
    * But, can have multiple Savings accounts in a single bank (PEL, PEA, LivretA, LivretJeune...)
    */

    private static int UniqueID = 0;
    private String name;
    private String ID;
    private CurrentAccount currentAccount;
    private ArrayList<SavingAccount> savingsaccounts;

    public Customer(String name) {

        this.name = name;
        currentAccount = null;
        savingsaccounts = new ArrayList<>();
        UniqueID += 1;
        this.ID ="C"+  UniqueID ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }

    public ArrayList<SavingAccount> getSavingsaccounts() {
        return savingsaccounts;
    }

    public void setSavingsaccounts(ArrayList<SavingAccount> savingsaccounts) {
        this.savingsaccounts = savingsaccounts;
    }

    public void addSavingAccounttoList(SavingAccount sa){
        savingsaccounts.add(sa);
    }

    public void removeanAccounttotheList(SavingAccount sa){
        savingsaccounts.remove(sa);
    }
}
