package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_299 {
    private final Production98_299 production = new Production98_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}