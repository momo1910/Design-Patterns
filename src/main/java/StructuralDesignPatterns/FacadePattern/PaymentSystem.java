package StructuralDesignPatterns.FacadePattern;

public class PaymentSystem {
    int amount;
    String username;


    public void payBills(String username, int amount){
        System.out.println(username + " User has paid the Amount for the food " +  amount);
    }
}
