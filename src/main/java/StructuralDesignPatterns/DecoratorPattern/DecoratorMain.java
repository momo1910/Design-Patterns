package StructuralDesignPatterns.DecoratorPattern;

public class DecoratorMain {
    public static void main(String args[]){

        Pizza pizza=new ChickenPizzaDecorator(new CheesePizzaDecorator(new BasePizza()));
        System.out.println(pizza.bake());
        Pizza pizza1=new PannerPizzaDecorator(new CheesePizzaDecorator(new BasePizza()));
        System.out.println(pizza1.bake());
    }
}
