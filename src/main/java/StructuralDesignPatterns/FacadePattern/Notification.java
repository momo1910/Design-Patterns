package StructuralDesignPatterns.FacadePattern;

public class Notification {
    String emailid;
    String phoneno;


    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public void sendNotification(String emailid, String phoneno){
        System.out.println("Your order bill has been sent . Invoice is sent to emailid and phonumber "+ emailid + " " + phoneno);
    }
}
