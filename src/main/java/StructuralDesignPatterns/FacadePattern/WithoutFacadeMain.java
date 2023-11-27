package StructuralDesignPatterns.FacadePattern;

public class WithoutFacadeMain {
    public static void main(String args[]) {
        /*Without FacadePattern*/
        User user = new User("priti", "spriti1991", "123456789");
        FoodOrder foodOrder = new FoodOrder();
        PaymentSystem paymentSystem = new PaymentSystem();
        Notification notification = new Notification();
        user.userDetails();
        foodOrder.orderFood("VadaPav");
        paymentSystem.payBills("priti",10);
        notification.sendNotification("spriti1991","123456789");

    }
}
