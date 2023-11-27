package StructuralDesignPatterns.ProxyPattern;

public class BankAccount implements Account{
    @Override
    public void withDraw(int amount) {
        System.out.println("Amount " + amount+ " has been debited from Your account ");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Amount " + amount+ " has been deposited to Your account ");

    }
}
