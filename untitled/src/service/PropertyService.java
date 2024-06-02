package service;

import model.House;
import model.Property;
import model.Villa;
import model.SummerHouse;
import repository.PropertyRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Service class containing business logic for properties.
 */
public class PropertyService {
    private PropertyRepository propertyRepository;

    // Constructor to initialize the property repository
    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    // Calculate the total price of houses
    public double getTotalPriceOfHouses() {
        return propertyRepository.getHouseList().stream().mapToDouble(Property::getPrice).sum();
    }

    // Calculate the total price of villas
    public double getTotalPriceOfVillas() {
        return propertyRepository.getVillaList().stream().mapToDouble(Property::getPrice).sum();
    }

    // Calculate the total price of summer houses
    public double getTotalPriceOfSummerHouses() {
        return propertyRepository.getSummerHouseList().stream().mapToDouble(Property::getPrice).sum();
    }

    // Calculate the total price of all properties
    public double getTotalPriceOfAllProperties() {
        return Stream.of(
                propertyRepository.getHouseList(),
                propertyRepository.getVillaList(),
                propertyRepository.getSummerHouseList()
        ).flatMap(List::stream).mapToDouble(Property::getPrice).sum();
    }

    // Calculate the average square meter of houses
    public double getAverageSquareMeterOfHouses() {
        return propertyRepository.getHouseList().stream().mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

    // Calculate the average square meter of villas
    public double getAverageSquareMeterOfVillas() {
        return propertyRepository.getVillaList().stream().mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

    // Calculate the average square meter of summer houses
    public double getAverageSquareMeterOfSummerHouses() {
        return propertyRepository.getSummerHouseList().stream().mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

    // Calculate the average square meter of all properties
    public double getAverageSquareMeterOfAllProperties() {
        return Stream.of(
                propertyRepository.getHouseList(),
                propertyRepository.getVillaList(),
                propertyRepository.getSummerHouseList()
        ).flatMap(List::stream).mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

    // Filter properties by the number of rooms and living rooms
    public List<Property> filterPropertiesByRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms) {
        return Stream.of(
                        propertyRepository.getHouseList(),
                        propertyRepository.getVillaList(),
                        propertyRepository.getSummerHouseList()
                ).flatMap(List::stream)
                .filter(property -> property.getNumberOfRooms() == numberOfRooms && property.getNumberOfLivingRooms() == numberOfLivingRooms)
                .collect(Collectors.toList());
    }
}
