package service;

import model.House;
import model.Property;
import model.Villa;
import model.SummerHouse;
import repository.PropertyRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PropertyService {
    private PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public double getTotalPriceOfHouses() {
        return propertyRepository.getHouseList().stream().mapToDouble(Property::getPrice).sum();
    }

    public double getTotalPriceOfVillas() {
        return propertyRepository.getVillaList().stream().mapToDouble(Property::getPrice).sum();
    }

    public double getTotalPriceOfSummerHouses() {
        return propertyRepository.getSummerHouseList().stream().mapToDouble(Property::getPrice).sum();
    }

    public double getTotalPriceOfAllProperties() {
        return Stream.of(
                propertyRepository.getHouseList(),
                propertyRepository.getVillaList(),
                propertyRepository.getSummerHouseList()
        ).flatMap(List::stream).mapToDouble(Property::getPrice).sum();
    }

    public double getAverageSquareMeterOfHouses() {
        return propertyRepository.getHouseList().stream().mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

    public double getAverageSquareMeterOfVillas() {
        return propertyRepository.getVillaList().stream().mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

    public double getAverageSquareMeterOfSummerHouses() {
        return propertyRepository.getSummerHouseList().stream().mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

    public double getAverageSquareMeterOfAllProperties() {
        return Stream.of(
                propertyRepository.getHouseList(),
                propertyRepository.getVillaList(),
                propertyRepository.getSummerHouseList()
        ).flatMap(List::stream).mapToDouble(Property::getSquareMeter).average().orElse(0);
    }

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
