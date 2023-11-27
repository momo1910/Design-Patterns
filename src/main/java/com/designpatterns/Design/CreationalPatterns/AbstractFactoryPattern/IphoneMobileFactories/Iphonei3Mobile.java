package com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.IphoneMobileFactories;

import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.OuterFactories.IphoneMobile;

public class Iphonei3Mobile extends IphoneMobile {
    public int getPrice(String displayType, Integer weight, Integer HDSize) {
        if(displayType=="HD" && weight <=3 && HDSize>=4)
            return 450000;
        else
            return 400000;
    }
}
