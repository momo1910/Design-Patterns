package com.designpatterns.Design.CreationalPatterns.FactoryPattern;

public class FactoryMain {

    public static void main(String args[]){
        System.out.println("Hello. Lets us see One example of Factory Pattern");
        BreadFactoryInterface breadFactoryInterface = new BreadFactoryInterface();
        System.out.println("Cost of Brown Bread is " + breadFactoryInterface.getBreadTypeCost("BROWN"));
        System.out.println("Cost of White Bread is " + breadFactoryInterface.getBreadTypeCost("white"));
        System.out.println("Cost of MultiGrain Bread is " + breadFactoryInterface.getBreadTypeCost("multigrain"));
        System.out.println("Cost of Garlic Bread is " + breadFactoryInterface.getBreadTypeCost("garlic"));
    }
}
