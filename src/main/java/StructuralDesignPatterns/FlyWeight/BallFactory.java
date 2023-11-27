package StructuralDesignPatterns.FlyWeight;

import java.util.HashMap;

public class BallFactory {
    public static final HashMap ballMap= new HashMap();
    public static Ball getBall(String colour, String url){
        StringBuilder sb = new StringBuilder();
        sb.append(colour);
        sb.append(url);
        String ballCachekey= sb.toString();
        Ball ball = (Ball) ballMap.get(ballCachekey);
        if(ball==null){
            ball=new Ball(colour,url);
            ballMap.put(ballCachekey,ball);
            System.out.println("creating ball of colour "+ colour );
        }
        return ball;
    }
}
