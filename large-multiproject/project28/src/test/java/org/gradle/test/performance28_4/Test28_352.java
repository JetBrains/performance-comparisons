package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_352 {
    private final Production28_352 production = new Production28_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}