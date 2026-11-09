package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean Occupied;
    private boolean Dirty;

    public Room() {}
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.Occupied = isOccupied;
        this.Dirty = isDirty;
    }

    public int getNumberOfBeds() {return numberOfBeds;}

    public double getPrice() {return price;}

    public boolean isOccupied() {return Occupied;}

    public boolean isDirty() {return Dirty;}

    public String toRow() {
        return "Number Of Beds: "+getNumberOfBeds()+" | Price: "+getPrice()+" | is Dirty: "+isDirty()+" | is Occupied: "+isOccupied();
    }
}
