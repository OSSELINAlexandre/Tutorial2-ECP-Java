package osselin.alexandre.Exercice1and2;

public abstract class Account {

    private static int Nonce = 1;
    private String AccountID;
    private int Balance;



    public static int getNonce() {
        return Nonce;
    }

    public static void setNonce(int nonce) {
        Nonce = nonce;
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String accountID) {
        AccountID = accountID;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    abstract void withdraw(int amount);
    abstract void deposit(int amount);
}
