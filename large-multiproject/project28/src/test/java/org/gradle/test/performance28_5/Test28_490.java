package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_490 {
    private final Production28_490 production = new Production28_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}