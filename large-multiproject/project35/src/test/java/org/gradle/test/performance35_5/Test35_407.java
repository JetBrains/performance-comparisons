package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_407 {
    private final Production35_407 production = new Production35_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}