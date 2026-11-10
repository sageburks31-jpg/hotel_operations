package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = isOccupied;
        this.dirty = isDirty;
    }

    public int getNumberOfBeds() {return numberOfBeds;}
    public void setNumberOfBeds(int numberOfBeds) {this.numberOfBeds = numberOfBeds;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public boolean isOccupied() {return occupied;}
    public void setOccupied(boolean occupied) {this.occupied = occupied;}

    public void checkIn() {setDirty(true); setOccupied(true);}
    public void checkOut() {setOccupied(false);}
    public void cleanRoom() {setDirty(false);}

    public boolean isDirty() {return dirty;}
    public void setDirty(boolean dirty) {this.dirty = dirty;}

    public boolean isAvailable() {return !isOccupied() && !isDirty();}
    public String toRow() {
        return "Number Of Beds: "+getNumberOfBeds()+" | Price: "+getPrice()+" | is Dirty: "+isDirty()+" | is Occupied: "+isOccupied()+" | is Available: "+isAvailable();
    }
}
