package com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.SamsungMobilefactories;

import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.OuterFactories.SamsungMobile;

public class FoldableSamsung extends SamsungMobile {
    public int getPrice(String displayType, Integer weight, Integer HDSize) {
        if(displayType=="HD" && weight <=3 && HDSize>=4)
            return 150000;
        else
            return 50000;
    }
}
