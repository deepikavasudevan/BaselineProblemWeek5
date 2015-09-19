package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class UniverseTest {

    @Test
    public void shouldCreateANewGeneration() {
        Cell seed[][] = {{new Cell("X", 3), new Cell("X", 3)}, {new Cell("X", 3), new Cell("X", 3)}};
        Universe universe = new Universe(seed);
        Cell newGeneration[][] = {{new Cell("X", 3), new Cell("X", 3)}, {new Cell("X", 3), new Cell("X", 3)}};

        assertArrayEquals(newGeneration, universe.newGeneration());
    }
}