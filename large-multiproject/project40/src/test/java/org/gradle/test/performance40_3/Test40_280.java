package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_280 {
    private final Production40_280 production = new Production40_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}