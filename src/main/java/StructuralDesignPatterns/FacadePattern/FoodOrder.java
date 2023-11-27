package StructuralDesignPatterns.FacadePattern;

public class FoodOrder {
    String foodname;



    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }
    public void orderFood(String foodname){
        System.out.println("Your Food is ordered  " + foodname);
    }

}
