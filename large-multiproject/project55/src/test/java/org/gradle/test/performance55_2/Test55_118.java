package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_118 {
    private final Production55_118 production = new Production55_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}