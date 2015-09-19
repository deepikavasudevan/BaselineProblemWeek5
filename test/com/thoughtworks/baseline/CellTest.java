package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void shouldCheckIfTheCurrentStateIsAliveOrDead() {
        Cell cell = new Cell("X", 5);

        assertEquals("-", cell.newState());
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndMakeTheCellDeadIfItHasOneLiveNeighbour() {
        Cell cell = new Cell("X", 1);

        assertEquals("-", cell.newState());
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndMakeTheCellDeadIfItHasNoLiveNeighbours() {
        Cell cell = new Cell("X", 0);

        assertEquals("-", cell.newState());
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndMakeTheCellDeadIfHasMoreThanThreeLiveNeighbours() {
        Cell cell = new Cell("X", 5);

        assertEquals("-", cell.newState());
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndLeaveItAliveIfItHasTwoNeighbours() {
        Cell cell = new Cell("X", 2);

        assertEquals("X", cell.newState());
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndLeaveItAliveIfItHasThreeNeighbours() {
        Cell cell = new Cell("X", 3);

        assertEquals("X", cell.newState());
    }

    @Test
    public void shouldCheckIfCurrentStateIsDeadAndMakeTheCellAliveIfItHasThreeLiveNeighbours() {
        Cell cell = new Cell("-", 3);

        assertEquals("X", cell.newState());
    }

    @Test
    public void shouldCheckIfCurrentStateIsDeadAndLeaveItDeadIfItDoesNotHaveThreeLiveNeighbours() {
        Cell cell = new Cell("-", 1);

        assertEquals("-", cell.newState());
    }
}