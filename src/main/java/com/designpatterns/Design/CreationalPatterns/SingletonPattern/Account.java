package com.designpatterns.Design.CreationalPatterns.SingletonPattern;

public  class Account {
    private static  Boolean billPaid=null;

    public static Boolean getAccountInfo(){
        if(billPaid==null) {
            billPaid = true;
            System.out.println("Bill paid for the first time");
                }
        else{
            System.out.println("Bill Already paid. No need to Pay again");
        }
        return billPaid;
    }

    private Account(){
    }
}
