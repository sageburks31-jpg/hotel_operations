package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Room room=new Room(2,12,false,false);
        System.out.print(room.toRow());
    }
}