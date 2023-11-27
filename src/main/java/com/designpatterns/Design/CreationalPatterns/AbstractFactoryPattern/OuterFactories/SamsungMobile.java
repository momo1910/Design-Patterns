package com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.OuterFactories;

import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.Models.Mobile;
import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.SamsungMobilefactories.FoldableSamsung;
import com.designpatterns.Design.CreationalPatterns.AbstractFactoryPattern.SamsungMobilefactories.GalaxyM31Samsung;


public class SamsungMobile implements Mobile {
    public SamsungMobile getSamsungBrandMobileCost(String samsungBrandType) {
        if (samsungBrandType.equalsIgnoreCase("M31")) {
            return new GalaxyM31Samsung();
        } else if (samsungBrandType.equalsIgnoreCase("foldable")) {
            return new FoldableSamsung();
        } else
            return null;
    }

}
