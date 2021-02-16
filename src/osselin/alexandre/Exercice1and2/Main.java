package osselin.alexandre.Exercice1and2;

public class Main {

    public static void main(String[] args) {

        /*For this second part of the exercise, we think that the bank is the main user of the program
        * Therefore, the composition is as follow :
        * A bank HAS customers
        * customers HAS accounts (Savings + Current)
        *
        *
        * We created the design so that a customer can be added to a bank even if the Accounts have not been instanciated yet
        * The method "SetAccounttoManagement" has to be called in order to update the list of managedAccount of the Bank
        * If we want to have a global view of a person, we ought to create a new class "Individual" composed of a list of "Customers"
        * Therefore, an "Individual" could have multiple current and savings accounts in multiple banks
        * Because the software is design for a given Bank; in "SetAccounttoManagement" all the accounts of a given customer are added to the managedAccount
        *
        * */

        Bank CA = new Bank("Crédit-Agricole Brie Picardie");
        Customer Smith = new Customer("Smith");
        Customer Davies = new Customer("Davies");
        CA.addCustomer(Smith);
        CA.addCustomer(Davies);

        CurrentAccount Smith1 = new CurrentAccount(-500);
        SavingAccount Smith2 = new SavingAccount(3);
        SavingAccount Smith3 = new SavingAccount(5);
        CurrentAccount Davies1 = new CurrentAccount(0);
        SavingAccount Davies2 = new SavingAccount(3);
        Smith.setCurrentAccount(Smith1);
        Smith.addSavingAccounttoList(Smith2);
        Smith.addSavingAccounttoList(Smith3);
        Davies.setCurrentAccount(Davies1);
        Davies.addSavingAccounttoList(Davies2);

        CA.SetAccounttoManagement(Smith);
        CA.SetAccounttoManagement(Davies);
        CA.SetAccounttoManagement(Smith);
        CA.SetAccounttoManagement(Davies);
        CA.SetAccounttoManagement(Smith);
        CA.SetAccounttoManagement(Davies);

        Smith1.deposit(1000);
        Smith1.deposit(1000);
        Smith1.deposit(1000);
        Smith1.deposit(1000);
        Smith1.withdraw(-4300);
        Smith1.withdraw(-2000);
        Davies2.deposit(1500);
    Davies2.calcultareCompoundinterest(2);
        Davies1.deposit(800);
        System.out.println(CA);

    }
}
