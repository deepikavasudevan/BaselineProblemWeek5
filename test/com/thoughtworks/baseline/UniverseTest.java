package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class UniverseTest {

    @Test
    public void shouldCreateANewGeneration() {
        Cell seed[][] = {{new Cell("X"), new Cell("X")}, {new Cell("X"), new Cell("X")}};
        Universe universe = new Universe(seed);
        Cell newGeneration[][] = {{new Cell("X"), new Cell("X")}, {new Cell("X"), new Cell("X")}};

        assertArrayEquals(seed, universe.newGeneration());
    }
}