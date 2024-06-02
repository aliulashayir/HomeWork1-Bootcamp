import model.Property;
import repository.PropertyRepository;
import service.PropertyService;

import java.util.List;

/**
 * Entry point of the application.
 */
public class Main {
    public static void main(String[] args) {
        // Initialize repository and service
        PropertyRepository propertyRepository = new PropertyRepository();
        PropertyService propertyService = new PropertyService(propertyRepository);

        // Calculate and print total prices
        System.out.println("Total price of houses: " + propertyService.getTotalPriceOfHouses());
        System.out.println("Total price of villas: " + propertyService.getTotalPriceOfVillas());
        System.out.println("Total price of summer houses: " + propertyService.getTotalPriceOfSummerHouses());
        System.out.println("Total price of all properties: " + propertyService.getTotalPriceOfAllProperties());

        // Calculate and print average square meters
        System.out.println("Average square meter of houses: " + propertyService.getAverageSquareMeterOfHouses());
        System.out.println("Average square meter of villas: " + propertyService.getAverageSquareMeterOfVillas());
        System.out.println("Average square meter of summer houses: " + propertyService.getAverageSquareMeterOfSummerHouses());
        System.out.println("Average square meter of all properties: " + propertyService.getAverageSquareMeterOfAllProperties());

        // Filter and print properties by number of rooms and living rooms
        List<Property> filteredProperties = propertyService.filterPropertiesByRoomsAndLivingRooms(5, 2);
        System.out.println("Filtered properties with 5 rooms and 2 living rooms: " + filteredProperties.size());
    }
}
