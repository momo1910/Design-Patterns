package StructuralDesignPatterns.DecoratorPattern;

public class CheesePizzaDecorator extends PizzaDecorator{


    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza) ;
    }



    public String bake() {
        return addCheese()+ pizza.bake();
    }

    private String addCheese() {
        return "Cheese";
    }
}
