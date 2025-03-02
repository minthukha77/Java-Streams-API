package JavaStreamAPI_Details.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaCollectors_toMap {
    public static void main(String[] args) {

        // Here, the name and the temperature
        // are defined as the type City
        System.out.println(
                prepareTemperature()
                        .stream()
                        .filter(city -> city.getTemperature() > 10)
                        .collect(Collectors.toMap(City::getName,City::getTemperature,
                                (key,identicalKey) -> key)));


    }
    private static List<City> prepareTemperature()
    {
        List<City> cities = new ArrayList<>();
        cities.add(new City("New Delhi", 33.5));
        cities.add(new City("Mexico", 14));
        cities.add(new City("New York", 13));
        cities.add(new City("Dubai", 43));
        cities.add(new City("London", 15));
        cities.add(new City("Alaska", 1));
        cities.add(new City("Kolkata", 30));
        cities.add(new City("Sydney", 11));
        cities.add(new City("Mexico", 15));
        cities.add(new City("Dubai", 43));
        return cities;
    }
}



