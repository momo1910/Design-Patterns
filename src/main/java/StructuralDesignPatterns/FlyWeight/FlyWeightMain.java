package StructuralDesignPatterns.FlyWeight;

import StructuralDesignPatterns.Compositepattern.Maths;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightMain {
    public static final String colours[]={"blue", "pink","red"};
    public static final Map<String,String> ballEntries=Map.of("blue","url1",
            "red","url2",
            "pink","url3");
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            String colour=getColour();
            String url=ballEntries.get(colour);
            Ball ball=(Ball)BallFactory.getBall(colour,url);
            ball.setXCord(getXCord());
            ball.setYCord(getYCord());
            ball.setZCord(getZCord());
            ball.draw(colour,ball.getXCord(),ball.getYCord(),ball.getZCord());
        }

    }
    private static String getColour(){
        return colours[(int) (Math.random()* colours.length)];
    }

    private static int getXCord(){
        return (int)(Math.random()*50);
    }
    private static int getYCord(){
        return (int)(Math.random()*50);
    }
    private static int getZCord(){
        return (int)(Math.random()*50);
    }
}
