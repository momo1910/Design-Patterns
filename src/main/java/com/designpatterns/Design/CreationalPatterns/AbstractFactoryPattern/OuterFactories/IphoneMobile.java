package com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.OuterFactories;

import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.IphoneMobileFactories.Iphonei3Mobile;
import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.IphoneMobileFactories.Iphonei5Mobile;
import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.Models.Mobile;

public class IphoneMobile implements Mobile {
    public IphoneMobile getIphoneBrandMobileCost(String iphoneBrandType) {
        if (iphoneBrandType.equalsIgnoreCase("i3")) {
            return new Iphonei3Mobile();
        } else if (iphoneBrandType.equalsIgnoreCase("i5")) {
            return new Iphonei5Mobile();
        } else
            return null;
    }


}
