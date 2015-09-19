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

    public Cell withNewState(int numberOfLiveCellNeighbours) {
        if (state.equals("X")) {
            if (numberOfLiveCellNeighbours < 2 || numberOfLiveCellNeighbours > 3)
                state = "-";
        } else {
            if (numberOfLiveCellNeighbours == 3)
                state = "X";
        }
        return new Cell(state, xPosition, yPosition);
    }

    public int numberOfLiveCellNeighbours(Cell[][] seed) {
        int numberOfLiveCellNeighbours = 0;

        if (xPosition != 0 && yPosition != 0) {
            if (seed[xPosition - 1][yPosition - 1].state.equals("X"))
                numberOfLiveCellNeighbours++;
        }

        if (xPosition != 0) {
            if (seed[xPosition - 1][yPosition].state.equals("X"))
                numberOfLiveCellNeighbours++;
        }

        if (xPosition != 0 && yPosition != seed.length - 1) {
            if (seed[xPosition - 1][yPosition + 1].state.equals("X"))
                numberOfLiveCellNeighbours++;
        }

        if (yPosition != 0) {
            if (seed[xPosition][yPosition - 1].state.equals("X"))
                numberOfLiveCellNeighbours++;
        }

        if (yPosition != seed.length - 1) {
            if (seed[xPosition][yPosition + 1].state.equals("X"))
                numberOfLiveCellNeighbours++;
        }

        if (xPosition != seed.length - 1 && yPosition != 0) {
            if (seed[xPosition + 1][yPosition - 1].state.equals("X"))
                numberOfLiveCellNeighbours++;
        }

        if (xPosition != seed.length - 1) {
            if (seed[xPosition + 1][yPosition].state.equals("X"))
                numberOfLiveCellNeighbours++;
        }

        if (xPosition != seed.length - 1 && yPosition != seed.length - 1) {
            if (seed[xPosition + 1][yPosition + 1].state.equals("X"))
                numberOfLiveCellNeighbours++;
        }

        return numberOfLiveCellNeighbours;
    }

    @Override
    public boolean equals(Object that){
        if(that != null && that.getClass() == this.getClass()) {
            Cell thatCell = (Cell) that;

            if(this == that || (this.state.equals(thatCell.state) && this.xPosition == thatCell.xPosition
                    && this.yPosition == thatCell.yPosition))
                return true;
        }
        return false;
    }
}