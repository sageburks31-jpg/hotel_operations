package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_markRoomOccupiedAndDirty() {
        //arrange
        int numberOfBeds = 2;
        double price = 12;
        boolean occupied = false;
        boolean dirty = false;
        Room room = new Room(numberOfBeds,price,occupied,dirty);

        //act
        room.checkIn();
        //assert
        assertEquals(!dirty,room.isDirty());

        //act
        room.checkOut();
        //assert
        assertEquals(occupied,room.isOccupied());

        //act
        room.cleanRoom();
        //assert
        assertEquals(dirty,room.isDirty());
    }
}