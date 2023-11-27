package StructuralDesignPatterns.AdapterPattern;

public class AddressAdapter {
    ZomatoAddress zomatoAddress;

    public AddressAdapter(ZomatoAddress zomatoAddress) {
        this.zomatoAddress = zomatoAddress;
    }

    public SwiggyAddress getZomatoAddress() {
        return new SwiggyAddress(zomatoAddress.getBlock(),zomatoAddress.getLocality(),zomatoAddress.getStation(),zomatoAddress.getZipcode());
    }

    public void setZomatoAddress(ZomatoAddress zomatoAddress) {
        this.zomatoAddress = zomatoAddress;
    }
}
