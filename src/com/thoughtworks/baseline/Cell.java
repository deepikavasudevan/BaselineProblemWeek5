/*Cell has the state of cell and the rules of its interactions with neighbours*/
package com.thoughtworks.baseline;

public class Cell {

    private String state;
    private int numberOfLiveCellNeighbours;

    public Cell(String state, int numberOfLiveCellNeighbours) {
        this.state = state;
        this.numberOfLiveCellNeighbours = numberOfLiveCellNeighbours;
    }

    public String newState() {
        if (state.equals("X")) {
            if (numberOfLiveCellNeighbours < 2 || numberOfLiveCellNeighbours > 3)
                state = "-";
        } else {
            if (numberOfLiveCellNeighbours == 3)
                state = "X";
        }
        return state;
    }
}