package model;

/**
 * Abstract base class for all property types.
 */
public abstract class Property {
    private double price;
    private double squareMeter;
    private int numberOfRooms;
    private int numberOfLivingRooms;

    // Constructor to initialize a property
    public Property(double price, double squareMeter, int numberOfRooms, int numberOfLivingRooms) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    // Getters for the property attributes
    public double getPrice() {
        return price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }
}
