package osselin.alexandre.Exercice1and2;


public class CurrentAccount extends Account{

    private int Threshold;

    public CurrentAccount(int threshold) {
        Account.setNonce(Account.getNonce() + 1);
        super.setAccountID("CA" + Account.getNonce());
        Threshold = threshold;
    }

    @Override
    public String toString() {
        return "Current Account , unique ID :" + super.getAccountID() + ", threshold:\t\t" + Threshold;
    }

    @Override
    public void setBalance(int balance) {
        System.out.println("Maintenance Setter, please erase this when the work is done");
    }

    @Override
    void withdraw(int amount) {
        if(amount >= 0){
            System.out.println("Please enter a negative number");
            System.out.println("\t Current Balance : " + this.getBalance());
        }else{

            if(super.getBalance() + amount >= Threshold){
                super.setBalance( super.getBalance() + amount);
                System.out.println("Withdrawal of " + amount + " sucessfully done");
                if(super.getBalance() < 0)
                    System.out.println("You are currently overdraft. For a reminder, your overdraft capacity is " + (-Threshold) +", you consumed " + super.getBalance());
                System.out.println("\t Current Balance : " + this.getBalance());
            }else{
                System.out.println("This operation will lead to an unauthorized overdraft. Please choose a smaller amount or call our agency.");
                System.out.println("\t Current Balance : " + this.getBalance());
            }

        }
    }

    @Override
    void deposit(int amount) {
        if(amount < 0 ){
            System.out.println("You cannot put a negative number for deposit");
            System.out.println("\t Current Balance : " + this.getBalance());
        }else
        {
            super.setBalance(super.getBalance() + amount);
            System.out.println("Deposit of " + amount + " sucessfully done");
            System.out.println("\t Current Balance : " + this.getBalance());
        }
    }
}
