package com.pluralsight;

public class App {
    public static void main(String[] args) {
        //Room
        System.out.print("\n");
        Room room=new Room(2,12,false,false);
        System.out.println(room.toRow());
        room.checkIn();

        System.out.println(room.toRow());
        room.checkOut();
        System.out.println(room.toRow());
        room.cleanRoom();

        System.out.println(room.toRow());
        displaySeparatorLine(room.toRow());

        //Reservation
        Reservation reservation=new Reservation("double",3,false);
        System.out.println(reservation.toRow());
        displaySeparatorLine(reservation.toRow());

        //Employee
        Employee employee=new Employee(20021,"bob","server",20,0);
        System.out.println(employee.toRow());
        System.out.println("non-overloaded");

        employee.punchIn();
        System.out.println(employee.toRow());
        employee.punchout();
        System.out.println(employee.toRow());

        System.out.println("overloaded");
        employee.punchIn(10);
        System.out.println(employee.toRow());
        employee.punchout(14);

        System.out.println(employee.toRow());
        displaySeparatorLine(employee.toRow());
    }

    private static void displaySeparatorLine(String prompt){
        for (int i = 0; i < prompt.length(); i++) {System.out.print("_");}
        System.out.print("\n");
    }

}