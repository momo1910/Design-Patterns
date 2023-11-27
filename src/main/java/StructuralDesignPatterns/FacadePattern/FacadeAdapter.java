package StructuralDesignPatterns.FacadePattern;

public class FacadeAdapter {
    String username;
    String emailid;
    String phonenumber;
    int amount;
    String foodName;

    public FacadeAdapter(String username, String emailid, String phonenumber, String foodName,int amount) {
        this.username = username;
        this.emailid = emailid;
        this.phonenumber = phonenumber;
        this.amount = amount;
        this.foodName=foodName;
        User user = new User(username,emailid,phonenumber);
        FoodOrder foodOrder = new FoodOrder();
        PaymentSystem paymentSystem = new PaymentSystem();
        Notification notification = new Notification();
        user.userDetails();
        foodOrder.orderFood(foodName);
        paymentSystem.payBills(username,amount);
        notification.sendNotification(emailid,phonenumber);
    }
}
