package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Room room=new Room(2,12,false,false);
        System.out.println(room.toRow());
        Reservation reservation=new Reservation("double",3,false);
        System.out.println(reservation.toRow());
        Employee employee=new Employee(20021,"bob","server",20,50);
        System.out.print(employee.toRow());
    }
}