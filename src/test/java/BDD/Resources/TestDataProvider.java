package BDD.Resources;

import java.util.ArrayList;
import java.util.List;

import POJO.Location;
import POJO.Place;

public class TestDataProvider {

    public Place getPlace(String name, String language, String address) 
    {
        Place place = new Place();
        List<String> types = new ArrayList<String>();
        types.add("HORNBILL");
        types.add("cobbler's store");
        place.setAccuracy(50);
        place.setLanguage(language);
        place.setName(name);
        place.setPhone_number("(+1)98894543543");
        place.setTypes(types);
        place.setAddress(address);
        place.setWebsite("https://google.com");
        Location location = new Location();
        location.setLat(-38.383494);
        location.setLng(33.427362);
        place.setLocation(location);
        System.out.println("Here");

        return place;

    }
}