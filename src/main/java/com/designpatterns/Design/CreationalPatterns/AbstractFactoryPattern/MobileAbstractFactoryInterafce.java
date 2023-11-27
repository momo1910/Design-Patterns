package com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern;

import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.Models.Mobile;
import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.OuterFactories.IphoneMobile;
import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.OuterFactories.NokiaMobile;
import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.OuterFactories.SamsungMobile;

public class MobileAbstractFactoryInterafce {
    public Mobile getBrancType(String brand){
        if(brand.equalsIgnoreCase("nokia"))
            return new NokiaMobile();
        if(brand.equalsIgnoreCase("samsung"))
            return new SamsungMobile();
        if(brand.equalsIgnoreCase("iphone"))
            return new IphoneMobile();
        return null;
    }
}
