package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_446 {
    private final Production35_446 production = new Production35_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}