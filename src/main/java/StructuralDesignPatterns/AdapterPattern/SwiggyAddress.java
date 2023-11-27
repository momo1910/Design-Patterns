package StructuralDesignPatterns.AdapterPattern;

public class SwiggyAddress implements Address {
   private String building ;
    private  String area ;
    private  String station;
    private String pincode ;

    public SwiggyAddress(String building, String area, String station, String pincode) {
        this.building = building;
        this.area = area;
        this.station = station;
        this.pincode = pincode;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }


    @Override
    public String toString() {
        return "SwiggyAddress{" +
                "building='" + building + '\'' +
                ", area='" + area + '\'' +
                ", station='" + station + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
