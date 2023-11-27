package StructuralDesignPatterns.DecoratorPattern;

public class BasePizza implements Pizza{
    @Override
    public String bake() {
        return "base pizza";
    }
}
