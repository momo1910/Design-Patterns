package StructuralDesignPatterns.AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class AdapterMain {
    public static void main(String args[]) {

        SwiggyAddress swiggyAddress = new SwiggyAddress("Shanti Plaza", "Shanti Park", "Miraroad", "400104");
        ZomatoAddress zomatoAddress = new ZomatoAddress("nandanwadi", "jawahar nagar", "goregoan", "400107");
        AddressAdapter addressAdapter = new AddressAdapter(zomatoAddress);
        List<SwiggyAddress> addressList = new ArrayList<>();
        addressList.add(swiggyAddress);
        addressList.add(addressAdapter.getZomatoAddress());
        System.out.println(addressList.toString()    );
    }
}
