package org.gradle.test.performancenull_153;

import static org.junit.Assert.*;

public class Testnull_15283 {
    private final Productionnull_15283 production = new Productionnull_15283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}