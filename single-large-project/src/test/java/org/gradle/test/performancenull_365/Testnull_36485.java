package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36485 {
    private final Productionnull_36485 production = new Productionnull_36485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}