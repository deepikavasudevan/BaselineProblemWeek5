/*A Universe has a seed with which it creates its new generation*/
package com.thoughtworks.baseline;

public class Universe {

    private Cell[][] seed;

    public Universe(Cell[][] seed) {
        this.seed = seed;
    }

    public Cell[][] newGeneration() {
        return seed;
    }
}