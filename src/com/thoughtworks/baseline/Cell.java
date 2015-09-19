/*Cell has the state of cell and the rules of its interactions with neighbours*/
package com.thoughtworks.baseline;

public class Cell {

    private int yPosition;
    private int xPosition;
    private String state;

    public Cell(String state, int xPosition, int yPosition) {
        this.state = state;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String newState(int numberOfLiveCellNeighbours) {
        if (state.equals("X")) {
            if (numberOfLiveCellNeighbours < 2 || numberOfLiveCellNeighbours > 3)
                state = "-";
        } else {
            if (numberOfLiveCellNeighbours == 3)
                state = "X";
        }
        return state;
    }

    public int numberOfLiveCellNeighbours(Cell[][] seed) {
        int numberOfLiveCellNeighbours = 0;

        if (seed[xPosition - 1][yPosition - 1].state.equals("X"))
            numberOfLiveCellNeighbours++;

        if (seed[xPosition - 1][yPosition].state.equals("X"))
            numberOfLiveCellNeighbours++;

        if (seed[xPosition - 1][yPosition + 1].state.equals("X"))
            numberOfLiveCellNeighbours++;

        if (seed[xPosition][yPosition - 1].state.equals("X"))
            numberOfLiveCellNeighbours++;

        if (seed[xPosition][yPosition + 1].state.equals("X"))
            numberOfLiveCellNeighbours++;

            return numberOfLiveCellNeighbours;
    }
}