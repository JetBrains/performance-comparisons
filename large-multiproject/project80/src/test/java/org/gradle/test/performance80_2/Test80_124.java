package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_124 {
    private final Production80_124 production = new Production80_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}