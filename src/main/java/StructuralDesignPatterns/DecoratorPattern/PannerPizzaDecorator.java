package StructuralDesignPatterns.DecoratorPattern;

public class PannerPizzaDecorator extends  PizzaDecorator{
    public PannerPizzaDecorator(Pizza pizza) {
        super(pizza);
    }
    public String bake() {
        return addPanner()+ pizza.bake();
    }

    private String addPanner() {
        return "Panner";
    }
}
