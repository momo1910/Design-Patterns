package StructuralDesignPatterns.ProxyPattern;

public class ATM implements Account{
    @Override
    public void withDraw(int amount) {
        BankAccount bankAccount= new BankAccount();
        bankAccount.withDraw(amount);

    }

    @Override
    public void deposit(int amount) {
        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(amount);

    }
}
