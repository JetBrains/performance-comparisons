package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_265 {
    private final Production40_265 production = new Production40_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}