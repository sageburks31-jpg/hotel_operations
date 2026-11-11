package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_markRoomOccupiedAndDirty() {
        //arrange
        int numberOfBeds = 2;
        double price = 124;
        boolean occupied = false;
        boolean dirty = true;
        Room room = new Room(numberOfBeds,price,occupied,dirty);

        //act - checks checkIn sets isDirty and isOccupied to true
        room.checkIn();
        //assert
        assertTrue(room.isDirty());
        assertTrue(room.isOccupied());

        //act - checks cleanRoom returns true if occupied is true
        room.cleanRoom();
        //assert
        assertTrue(room.isDirty());

        //act - checks checkOut sets isOccupied to false and leaves dirty alone
        room.checkOut();
        //assert
        assertTrue(room.isDirty());
        assertFalse(room.isOccupied());

        //act - checks cleanRoom returns false if occupied is false
        room.cleanRoom();
        //assert
        assertFalse(room.isDirty());
    }
}