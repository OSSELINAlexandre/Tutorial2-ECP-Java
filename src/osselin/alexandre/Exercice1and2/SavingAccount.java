package osselin.alexandre.Exercice1and2;




public class SavingAccount extends Account {



    private double InterestRate;

    public SavingAccount(double interestRate) {
        Account.setNonce(Account.getNonce() + 1);
        super.setAccountID("SA" + Account.getNonce());
        InterestRate = interestRate;


    }


    @Override
    void withdraw(int amount) {
        if(amount >=0){
            System.out.println("You cannot withdraw a positive amount, please enter a negative amount ");
        }else{
            if(super.getBalance() + amount < 0){
                System.out.println("This opretaion will lead to an overdraft, please choose a lower amount");
                System.out.println("\t Current Balance : " + this.getBalance());

            }else{
                super.setBalance(super.getBalance() + amount);
                System.out.println("Withdrawal of " + amount + " sucessfully done");
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

    @Override
    public String toString() {
        return "Saving Account  , unique ID :" + super.getAccountID() + ", interest-rate :\t" + InterestRate;
    }

    public void calcultareCompoundinterest(int year){
        System.out.println("if you wait for " + year + "years at an interest rate of " + InterestRate + " you will earn "+

                ((super.getBalance() * Math.pow( (1 + (InterestRate / 100)) , year) - super.getBalance()))

        );
    }

    /*
    * Different methods with different time's period could be implemented in order to help the banker in it's consulting
    *
    * */

}
