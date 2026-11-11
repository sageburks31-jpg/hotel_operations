package com.pluralsight;

public class Room {
    private final int numberOfBeds;
    private final double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = isOccupied;
        this.dirty = isDirty;
    }

    public int getNumberOfBeds() {return numberOfBeds;}

    public double getPrice() {return price;}

    public boolean isOccupied() {return occupied;}
    public void setOccupied(boolean occupied) {this.occupied = occupied;}

    public void checkIn() {setDirty(true); setOccupied(true);}
    public void checkOut() {setOccupied(false);}
    public void cleanRoom() {if (!isOccupied()) {setDirty(false);}}

    public boolean isDirty() {return dirty;}
    public void setDirty(boolean dirty) {this.dirty = dirty;}

    public boolean isAvailable() {return !isOccupied() && !isDirty();}
    public String toRow() {
        return "Number Of Beds: "+getNumberOfBeds()+" | Price: "+getPrice()+" | is Dirty: "+isDirty()+" | is Occupied: "+isOccupied()+" | is Available: "+isAvailable();
    }
}
