/*A Universe has a seed with which it creates its new generation*/
package com.thoughtworks.baseline;

public class Universe {

    private String[][] seed;

    public Universe(String[][] seed) {
        this.seed = seed;
    }

    public String[][] newGeneration() {
        return seed;
    }
}