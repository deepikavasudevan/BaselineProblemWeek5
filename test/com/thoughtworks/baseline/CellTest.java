package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void shouldCheckIfTheCurrentStateIsAliveOrDead() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals("-", cell.newState(5));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndMakeTheCellDeadIfItHasOneLiveNeighbour() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals("-", cell.newState(1));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndMakeTheCellDeadIfItHasNoLiveNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals("-", cell.newState(0));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndMakeTheCellDeadIfHasMoreThanThreeLiveNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals("-", cell.newState(5));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndLeaveItAliveIfItHasTwoNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals("X", cell.newState(2));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndLeaveItAliveIfItHasThreeNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals("X", cell.newState(3));
    }

    @Test
    public void shouldCheckIfCurrentStateIsDeadAndMakeTheCellAliveIfItHasThreeLiveNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals("X", cell.newState(3));
    }

    @Test
    public void shouldCheckIfCurrentStateIsDeadAndLeaveItDeadIfItDoesNotHaveThreeLiveNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals("-", cell.newState(1));
    }

    @Test
    public void shouldCheckUpperLeftNeighbourAndIncrementTheNumberOfLiveNeighboursIfItIsAlive() {
        Cell seed[][] = {{new Cell("X", 0, 0), new Cell("-", 0, 1), new Cell("-", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("-", 2, 0), new Cell("-", 2, 1), new Cell("-", 2, 2)}};
        Cell cell = new Cell("X", 1, 1);

        assertEquals(1, cell.numberOfLiveCellNeighbours(seed));
    }
}