package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_211 {
    private final Production13_211 production = new Production13_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}