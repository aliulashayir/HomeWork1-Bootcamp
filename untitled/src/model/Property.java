package model;

public abstract class Property {
    private static double price;
    private double squareMeter;
    private int numberOfRooms;
    private int numberOfLivingRooms;

    public Property(double price, double squareMeter, int numberOfRooms, int numberOfLivingRooms) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

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

