package StructuralDesignPatterns.FlyWeight;

public class Ball {
    private String colour;
    private String imageURL;
    int XCord;
    int YCord;
    int ZCord;

    public Ball(String colour, String imageURL) {
        this.colour = colour;
        this.imageURL = imageURL;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getXCord() {
        return XCord;
    }

    public void setXCord(int XCord) {
        this.XCord = XCord;
    }

    public int getYCord() {
        return YCord;
    }

    public void setYCord(int YCord) {
        this.YCord = YCord;
    }

    public int getZCord() {
        return ZCord;
    }

    public void setZCord(int ZCord) {
        this.ZCord = ZCord;
    }
    public void draw(String colour, int x , int y , int z){
        System.out.println("Drawing ball with colour at x, y and z cordinates " + colour + " "+ x+ " "+ y + " "+ z);
    }
}
