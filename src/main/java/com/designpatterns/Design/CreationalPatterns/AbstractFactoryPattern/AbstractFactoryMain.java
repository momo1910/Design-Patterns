package com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern;

import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.NokiaMobileFactories.NokiaX6;
import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.OuterFactories.NokiaMobile;

public class AbstractFactoryMain {
    public static void main(String args[]) {
        System.out.println("Hello. Lets us see One example of Abstract Factory Pattern");
        MobileAbstractFactoryInterafce mobileAbstractFactoryInterafce= new MobileAbstractFactoryInterafce();
        NokiaMobile mobile= (NokiaMobile) mobileAbstractFactoryInterafce.getBrancType("NOKIA");
        NokiaX6 nokiaX6 = (NokiaX6) mobile.getNokiaBrandMobileCost("X6");
        System.out.println("The price of Nokia Phone is "+ nokiaX6.getPrice("HD",3,4));
    }
}
