package StructuralDesignPatterns.Compositepattern;

public class Physics implements Subject{

    String name;
    int fees;

    public Physics(String name, int fees) {
        this.name = name;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public String getSubjectName() {
        return getName();
    }
}
