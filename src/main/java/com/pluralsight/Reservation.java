package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean stayOverWeekend;

    public Reservation() {}

    public Reservation(String roomType, int numberOfNights, boolean stayOverWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.stayOverWeekend = stayOverWeekend;
    }

    public String getRoomType() {return roomType;}
    public double getRoomPrice() {
        return switch (roomType) {
            case "king"-> 139.00;
            case "double"-> 124.00;
            default -> throw new IllegalStateException("Unexpected value: " + roomType);
        };
    }

    public int getNumberOfNights() {return numberOfNights;}

    public boolean isStayOverWeekend() {return stayOverWeekend;}

    public String toRow() {
        return "Room Type: "+getRoomType()+" | Number Of Nights: "+getNumberOfNights()+" | is Staying Over the Weekend: "+isStayOverWeekend();
    }
}
