package com.pluralsight;

public class Hotel {
    private final String name;
    private final int numberOfSuites;
    private final int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
        System.out.println(bookRoom(0,false));
    }
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public int getAvailableSuites() {
        int suites = 0;
        if ((numberOfSuites - bookedSuites) > suites) {
            suites = numberOfSuites - bookedSuites;
        }
        return suites;
    }

    public int getAvailableRooms() {
        int rooms = 0;
        if ((numberOfRooms - bookedBasicRooms) > rooms) {
            rooms = numberOfRooms - bookedBasicRooms;
        }
        return rooms;
    }

    public boolean bookRoom(int roomCount, boolean suite) {
        int totalRoomCount;
        int totalBookCount;
        if (suite) {
            if (numberOfSuites > bookedSuites) bookedSuites+=roomCount;
            if (numberOfSuites < bookedSuites) bookedSuites=numberOfSuites;
            totalBookCount = bookedSuites;
            totalRoomCount = numberOfSuites;
        } else {
            if (numberOfRooms > bookedBasicRooms) bookedBasicRooms+=roomCount;
            if (numberOfRooms < bookedBasicRooms) bookedBasicRooms=numberOfRooms;
            totalBookCount = bookedBasicRooms;
            totalRoomCount = numberOfRooms;
        }
        return totalRoomCount > totalBookCount;
    }

    public String toRow() {
        return "name: "+name+" | number Of Suites: "+numberOfSuites+" | number Of Rooms: "+numberOfRooms+" | booked Suites: "+bookedSuites+" | booked Basic Rooms: "+bookedBasicRooms;
    }
}
