package StructuralDesignPatterns.DecoratorPattern;

public class ChickenPizzaDecorator extends  PizzaDecorator{
    public ChickenPizzaDecorator(Pizza pizza) {
        super(pizza);
    }
    public String bake() {
        return addChicken()+ pizza.bake();
    }

    private String addChicken() {
        return "Chicken";
    }
}
