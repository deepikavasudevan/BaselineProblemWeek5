package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void shouldHaveANewStateOnComparingItWithTheStatesOfItsNeighbours() {
        Cell cell = new Cell("X");

        assertEquals("X", cell.newState(3));
    }

    @Test
    public void shouldCheckIfTheCurrentStateIsAliveOrDead() {
        Cell cell = new Cell("X");

        assertEquals("-", cell.newState(3));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndMakeTheCellDeadIfItHasOneLiveNeighbour() {
        Cell cell = new Cell("X");

        assertEquals("-", cell.newState(1));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndMakeTheCellDeadIfItHasNoLiveNeighbours() {
        Cell cell = new Cell("X");

        assertEquals("-", cell.newState(0));
    }
}