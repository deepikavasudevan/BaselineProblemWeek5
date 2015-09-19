package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class UniverseTest {

    @Test
    public void shouldCreateANewGeneration() {
        Cell seed[][] = {{new Cell("X", 0, 0), new Cell("X", 0, 1)}, {new Cell("X", 1, 0), new Cell("X", 1, 0)}};
        Universe universe = new Universe(seed);
        Cell newGeneration[][] = {{new Cell("X", 1, 0), new Cell("X", 1, 0)}, {new Cell("X", 1, 0), new Cell("X", 1, 0)}};

        assertArrayEquals(seed, universe.newGeneration());
    }
}