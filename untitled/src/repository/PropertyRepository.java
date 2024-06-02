package repository;

import model.House;
import model.Villa;
import model.SummerHouse;
import java.util.ArrayList;
import java.util.List;

public class PropertyRepository {
    private List<House> houses;
    private List<Villa> villas;
    private List<SummerHouse> summerHouses;

    public PropertyRepository() {
        houses = new ArrayList<>();
        villas = new ArrayList<>();
        summerHouses = new ArrayList<>();

        // Add sample houses
        houses.add(new House(100000, 120, 3, 1));
        houses.add(new House(150000, 150, 4, 1));
        houses.add(new House(200000, 180, 5, 2));

        // Add sample villas
        villas.add(new Villa(300000, 250, 6, 2));
        villas.add(new Villa(350000, 300, 7, 3));
        villas.add(new Villa(400000, 350, 8, 4));

        // Add sample summer houses
        summerHouses.add(new SummerHouse(250000, 200, 4, 2));
        summerHouses.add(new SummerHouse(275000, 220, 5, 2));
        summerHouses.add(new SummerHouse(300000, 250, 6, 3));
    }

    public List<House> getHouseList() {
        return houses;
    }

    public List<Villa> getVillaList() {
        return villas;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouses;
    }
}
