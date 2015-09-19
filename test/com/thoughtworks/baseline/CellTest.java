package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CellTest {

    @Test
    public void shouldCheckIfTheCurrentStateIsAliveOrDead() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals(new Cell("-", 0, 0), cell.withNewState(5));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndMakeTheCellDeadIfItHasOneLiveNeighbour() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals(new Cell("-", 0, 0), cell.withNewState(1));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndMakeTheCellDeadIfItHasNoLiveNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals(new Cell("-", 0, 0), cell.withNewState(0));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndMakeTheCellDeadIfHasMoreThanThreeLiveNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals(new Cell("-", 0, 0), cell.withNewState(5));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndLeaveItAliveIfItHasTwoNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals(new Cell("X", 0, 0), cell.withNewState(2));
    }

    @Test
    public void shouldCheckIfCurrentStateIsAliveAndLeaveItAliveIfItHasThreeNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals(new Cell("X", 0, 0), cell.withNewState(3));
    }

    @Test
    public void shouldCheckIfCurrentStateIsDeadAndMakeTheCellAliveIfItHasThreeLiveNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals(new Cell("X", 0, 0), cell.withNewState(3));
    }

    @Test
    public void shouldCheckIfCurrentStateIsDeadAndLeaveItDeadIfItDoesNotHaveThreeLiveNeighbours() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals(new Cell("-", 0, 0), cell.withNewState(1));
    }

    @Test
    public void shouldCheckUpperLeftNeighbourAndIncrementTheNumberOfLiveNeighboursIfItIsAlive() {
        Cell seed[][] = {{new Cell("X", 0, 0), new Cell("-", 0, 1), new Cell("-", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("-", 2, 0), new Cell("-", 2, 1), new Cell("-", 2, 2)}};
        Cell cell = new Cell("X", 1, 1);

        assertEquals(1, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldCheckUpperNeighbourAndIncrementTheNumberOfLiveNeighboursIfItIsAlive() {
        Cell seed[][] = {{new Cell("-", 0, 0), new Cell("X", 0, 1), new Cell("-", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("-", 2, 0), new Cell("-", 2, 1), new Cell("-", 2, 2)}};
        Cell cell = new Cell("X", 1, 1);

        assertEquals(1, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldCheckUpperRightNeighbourAndIncrementTheNumberOfLiveNeighboursIfItIsAlive() {
        Cell seed[][] = {{new Cell("-", 0, 0), new Cell("-", 0, 1), new Cell("X", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("-", 2, 0), new Cell("-", 2, 1), new Cell("-", 2, 2)}};
        Cell cell = new Cell("X", 1, 1);

        assertEquals(1, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldCheckLeftNeighbourAndIncrementTheNumberOfLiveNeighboursIfItIsAlive() {
        Cell seed[][] = {{new Cell("-", 0, 0), new Cell("-", 0, 1), new Cell("-", 0, 2)}, {new Cell("X", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("-", 2, 0), new Cell("-", 2, 1), new Cell("-", 2, 2)}};
        Cell cell = new Cell("X", 1, 1);

        assertEquals(1, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldCheckRightNeighbourAndIncrementTheNumberOfLiveNeighboursIfItIsAlive() {
        Cell seed[][] = {{new Cell("-", 0, 0), new Cell("-", 0, 1), new Cell("-", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("X", 1, 2)},
                {new Cell("-", 2, 0), new Cell("-", 2, 1), new Cell("-", 2, 2)}};
        Cell cell = new Cell("X", 1, 1);

        assertEquals(1, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldCheckBottomLeftNeighbourAndIncrementTheNumberOfLiveNeighboursIfItIsAlive() {
        Cell seed[][] = {{new Cell("-", 0, 0), new Cell("-", 0, 1), new Cell("-", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("X", 2, 0), new Cell("-", 2, 1), new Cell("-", 2, 2)}};
        Cell cell = new Cell("X", 1, 1);

        assertEquals(1, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldCheckBottomNeighbourAndIncrementTheNumberOfLiveNeighboursIfItIsAlive() {
        Cell seed[][] = {{new Cell("-", 0, 0), new Cell("-", 0, 1), new Cell("-", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("-", 2, 0), new Cell("X", 2, 1), new Cell("-", 2, 2)}};
        Cell cell = new Cell("X", 1, 1);

        assertEquals(1, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldCheckBottomRightNeighbourAndIncrementTheNumberOfLiveNeighboursIfItIsAlive() {
        Cell seed[][] = {{new Cell("-", 0, 0), new Cell("-", 0, 1), new Cell("-", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("-", 2, 0), new Cell("-", 2, 1), new Cell("X", 2, 2)}};
        Cell cell = new Cell("X", 1, 1);

        assertEquals(1, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldNotConsiderUpperRowAsNeighboursIfCellBeingCheckedIsInUpperRow() {
        Cell seed[][] = {{new Cell("-", 0, 0), new Cell("-", 0, 1), new Cell("-", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("-", 2, 0), new Cell("-", 2, 1), new Cell("X", 2, 2)}};
        Cell cell = new Cell("-", 0, 1);

        assertEquals(1, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldNotConsiderBottomRowAsNeighboursIfCellBeingCheckedIsInBottomRow() {
        Cell seed[][] = {{new Cell("-", 0, 0), new Cell("-", 0, 1), new Cell("-", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("-", 2, 0), new Cell("X", 2, 1), new Cell("-", 2, 2)}};
        Cell cell = new Cell("-", 2, 1);

        assertEquals(1, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldNotConsiderLeftmostRowAsNeighbourIfCellIsInLeftMostRow() {
        Cell seed[][] = {{new Cell("-", 0, 0), new Cell("-", 0, 1), new Cell("-", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("-", 2, 0), new Cell("X", 2, 1), new Cell("-", 2, 2)}};
        Cell cell = new Cell("-", 1, 0);

        assertEquals(2, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldNotConsiderRightmostRowAsNeighbourIfCellIsInRightMostRow() {
        Cell seed[][] = {{new Cell("-", 0, 0), new Cell("-", 0, 1), new Cell("-", 0, 2)}, {new Cell("-", 1, 0), new Cell("X", 1, 1), new Cell("-", 1, 2)},
                {new Cell("-", 2, 0), new Cell("X", 2, 1), new Cell("-", 2, 2)}};
        Cell cell = new Cell("-", 1, 2);

        assertEquals(2, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldGiveItsTotalNumberOfNeighbours() {
        Cell seed[][] = {{new Cell("X", 0, 0), new Cell("X", 0, 1)}, {new Cell("X", 1, 0), new Cell("X", 1, 0)}};
        Cell cell = new Cell("X", 0, 0);

        assertEquals(3, cell.numberOfLiveCellNeighbours(seed));
    }

    @Test
    public void shouldNotBeEqualToNull() {
        Cell cell = new Cell("X", 0, 0);

        assertNotEquals(cell, null);
    }

    @Test
    public void shouldBeOfTypeCell() {
        Cell cell = new Cell("X", 0, 0);

        assertNotEquals(cell, "This is not a valid object");
    }

    @Test
    public void shouldBeEqualToItself() {
        Cell cell = new Cell("X", 0, 0);

        assertEquals(cell, cell);
    }

    @Test
    public void shouldNotBeEqualIfItHasTheSameStateButNotTheSamePosition() {
        Cell cell1 = new Cell("X", 0, 0);
        Cell cell2 = new Cell("X", 1, 1);

        assertNotEquals(cell1, cell2);
    }

    @Test
    public void shouldNotBeEqualIfItHasTheSameXPositionButNotTheSameStateOrYPosition() {
        Cell cell1 = new Cell("X", 1, 0);
        Cell cell2 = new Cell("-", 1, 1);

        assertNotEquals(cell1, cell2);
    }

    @Test
    public void shouldNotBeEqualIfItHasTheSameYPositionButNotTheSameStateOrXPosition() {
        Cell cell1 = new Cell("X", 0, 1);
        Cell cell2 = new Cell("-", 1, 1);

        assertNotEquals(cell1, cell2);
    }

    @Test
    public void shouldNotBeEqualIfItHasTheSameXAndYPositionButNotTheSameState() {
        Cell cell1 = new Cell("X", 1, 1);
        Cell cell2 = new Cell("-", 1, 1);

        assertNotEquals(cell1, cell2);
    }

    @Test
    public void shouldNotBeEqualIfItHasTheSameStateAndYPositionButNotTheSameXPosition() {
        Cell cell1 = new Cell("X", 1, 1);
        Cell cell2 = new Cell("X", 0, 1);

        assertNotEquals(cell1, cell2);
    }

    @Test
    public void shouldNotBeEqualIfItHasTheSameStateAndXPositionButNotTheSameYPosition() {
        Cell cell1 = new Cell("X", 1, 0);
        Cell cell2 = new Cell("X", 1, 1);

        assertNotEquals(cell1, cell2);
    }

    @Test
    public void shouldBeEqualIfItHasTheSameStateAndPosition() {
        Cell cell1 = new Cell("X", 1, 1);
        Cell cell2 = new Cell("X", 1, 1);

        assertEquals(cell1, cell2);
    }
}