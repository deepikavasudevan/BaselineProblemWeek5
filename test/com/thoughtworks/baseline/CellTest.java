package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void shouldHaveANewStateOnComparingItWithTheStatesOfItsNeighbours() {
        Cell cell = new Cell("X");

        assertEquals("X", cell.newState(3));
    }
}