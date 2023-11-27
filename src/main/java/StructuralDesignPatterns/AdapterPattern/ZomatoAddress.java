package StructuralDesignPatterns.AdapterPattern;

public class ZomatoAddress {
    private String block ;
    private  String Locality ;
    private  String station;
    private String zipcode ;

    public ZomatoAddress(String block, String locality, String station, String zipcode) {
        this.block = block;
        Locality = locality;
        this.station = station;
        this.zipcode = zipcode;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLocality() {
        return Locality;
    }

    public void setLocality(String locality) {
        Locality = locality;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }




    @Override
    public String toString() {
        return "ZomatoAddress{" +
                "block='" + block + '\'' +
                ", Locality='" + Locality + '\'' +
                ", station='" + station + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
