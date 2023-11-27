package com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.OuterFactories;

import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.Models.Mobile;
import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.NokiaMobileFactories.Nokia105Keypad;
import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.NokiaMobileFactories.NokiaX6;

public class NokiaMobile implements Mobile {

    public NokiaMobile getNokiaBrandMobileCost(String nokiaBrandType) {
        if (nokiaBrandType.equalsIgnoreCase("X6")) {
            return new NokiaX6();
        } else if (nokiaBrandType.equalsIgnoreCase("105keypad")) {
            return new Nokia105Keypad();
        } else
            return null;
    }
}