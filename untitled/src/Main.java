import model.House;
import repository.PropertyRepository;
import service.PropertyService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PropertyRepository propertyRepository = new PropertyRepository();
        PropertyService propertyService = new PropertyService(propertyRepository);

        System.out.println("Total price of houses: " + propertyService.getTotalPriceOfHouses());
        System.out.println("Total price of villas: " + propertyService.getTotalPriceOfVillas());
        System.out.println("Total price of summer houses: " + propertyService.getTotalPriceOfSummerHouses());
        System.out.println("Total price of all properties: " + propertyService.getTotalPriceOfAllProperties());

        System.out.println("Average square meter of houses: " + propertyService.getAverageSquareMeterOfHouses());
        System.out.println("Average square meter of villas: " + propertyService.getAverageSquareMeterOfVillas());
        System.out.println("Average square meter of summer houses: " + propertyService.getAverageSquareMeterOfSummerHouses());
        System.out.println("Average square meter of all properties: " + propertyService.getAverageSquareMeterOfAllProperties());

        List<House> filteredProperties = propertyService.filterPropertiesByRoomsAndLivingRooms(5, 2);
        System.out.println("Filtered properties with 5 rooms and 2 living rooms: " + filteredProperties.size());
    }
}
