package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_455 {
    private final Production35_455 production = new Production35_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}