package StructuralDesignPatterns.ProxyPattern;

public class ProxyMain {

    public static void main(String args[]){
        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(100);

        //ATM is a proxy for our Bank Account .
        ATM atm= new ATM();
        atm.deposit(100);
    }
}
