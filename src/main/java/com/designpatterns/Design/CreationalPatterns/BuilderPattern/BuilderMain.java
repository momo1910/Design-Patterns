package com.designpatterns.Design.CreationalPatterns.BuilderPattern;

public class BuilderMain {

    public static void main(String Args[]){
        System.out.println("Let see one example of Builder Pattern");
        HouseConstruction.HouseConstructionBuilder houseConstructionBuilder=new HouseConstruction.HouseConstructionBuilder();
        HouseConstruction houseConstruction = houseConstructionBuilder.setBalcony("bal").setChimmney("chim").setDoors("doors").setKitchen("kicten").build();
        System.out.println(houseConstruction.balcony);
        System.out.println(houseConstruction.chimmney);
        System.out.println(houseConstruction.doors);
        System.out.println(houseConstruction.kitchen);


        HouseConstruction houseConstruction1 = houseConstructionBuilder.setBalcony("bal1").setChimmney("chim1").setKitchen("kicten1").setFloor("floor1").build();
        System.out.println(houseConstruction1.balcony);
        System.out.println(houseConstruction1.chimmney);
        System.out.println(houseConstruction1.floor
        );
        System.out.println(houseConstruction1.kitchen);

    }
}
