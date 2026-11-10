package com.pluralsight;

public class Reservation {
    private final String roomType;
    private final int numberOfNights;
    private final boolean stayOverWeekend;

    public Reservation(String roomType, int numberOfNights, boolean stayOverWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.stayOverWeekend = stayOverWeekend;
    }

    public String getRoomType() {return roomType;}
    public double getPrice() {
        double originalPrice = switch (roomType) {
            case "king"-> 139.00;
            case "double"-> 124.00;
            default -> throw new IllegalStateException("Unexpected value: " + roomType);
        };
        double percentOfPrice=0;
        if (isWeekend()) {percentOfPrice=originalPrice*.1;}
        return originalPrice+percentOfPrice;
    }

    public int getNumberOfNights() {return numberOfNights;}
    public boolean isWeekend() {return stayOverWeekend;}

    public String toRow() {
        return "Room Type: "+getRoomType()+" | Number Of Nights: "+getNumberOfNights()+" | is Staying Over the Weekend: "+isWeekend()+" | Room Price: "+getPrice();
    }
}
