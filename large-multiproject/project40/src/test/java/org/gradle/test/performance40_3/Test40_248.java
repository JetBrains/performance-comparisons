package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_248 {
    private final Production40_248 production = new Production40_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}