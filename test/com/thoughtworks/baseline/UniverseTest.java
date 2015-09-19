package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class UniverseTest {

    @Test
    public void shouldCreateANewGeneration() {
        String seed[][] = {{"X", "X"}, {"X", "X"}};
        Universe universe = new Universe(seed);
        String newGeneration[][] = {{"X", "X"}, {"X", "X"}};

        assertArrayEquals(newGeneration, universe.newGeneration());
    }
}