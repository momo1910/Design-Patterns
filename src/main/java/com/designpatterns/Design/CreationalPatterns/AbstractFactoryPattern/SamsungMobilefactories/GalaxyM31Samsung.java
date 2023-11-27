package com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.SamsungMobilefactories;

import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.OuterFactories.SamsungMobile;

public class GalaxyM31Samsung extends SamsungMobile {
    public int getPrice(String displayType, Integer weight, Integer HDSize) {
        if(displayType=="HD" && weight <=3 && HDSize>=4)
            return 60000;
        else
            return 6000;
    }
}
