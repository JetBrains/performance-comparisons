package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_15 {
    private final Production40_15 production = new Production40_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}