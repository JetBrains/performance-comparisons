package org.gradle.test.performancenull_113;

import static org.junit.Assert.*;

public class Testnull_11262 {
    private final Productionnull_11262 production = new Productionnull_11262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}