package com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.NokiaMobileFactories;

import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.OuterFactories.NokiaMobile;

public class Nokia105Keypad extends NokiaMobile {

    public int getPrice(String displayType, Integer weight, Integer HDSize) {
        if(displayType=="HD" && weight <=3 && HDSize>=4)
            return 15000;
        else
            return 1500;
    }
}
