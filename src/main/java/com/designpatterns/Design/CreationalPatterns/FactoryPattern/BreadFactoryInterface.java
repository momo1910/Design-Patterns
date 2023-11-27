package com.designpatterns.Design.CreationalPatterns.FactoryPattern;

public class BreadFactoryInterface {
    public int getBreadTypeCost(String breadType) {
        if (breadType.equalsIgnoreCase("brown")) {
            Bread bread = new BrownBread();
            return bread.getBreadPrice();
        }
        else if (breadType.equalsIgnoreCase("white")) {
            Bread bread = new WhiteBread();
            return bread.getBreadPrice();
        }
        else if (breadType.equalsIgnoreCase("multigrain")) {
            Bread bread = new MultiGrainBread();
            return bread.getBreadPrice();
        }
        else
            return 0;
    }
}
