/*Cell has the state of cell and the rules of its interactions with neighbours*/
package com.thoughtworks.baseline;

public class Cell {

    private String state;

    public Cell(String state) {
        this.state = state;
    }

    public String newState(int numberOfLiveCelledNeighbours) {
        if (state.equals("X")) {
            if (numberOfLiveCelledNeighbours == 1 || numberOfLiveCelledNeighbours == 0)
                state = "-";
        }
        return state;
    }
}