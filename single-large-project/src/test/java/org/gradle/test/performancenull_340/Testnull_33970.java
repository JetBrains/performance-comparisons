package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33970 {
    private final Productionnull_33970 production = new Productionnull_33970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}