/*Cell has the state of cell and the rules of its interactions with neighbours*/
package com.thoughtworks.baseline;

public class Cell {

    private String state;

    public Cell(String state) {
        this.state = state;
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
}