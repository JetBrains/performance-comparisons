package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21365 {
    private final Productionnull_21365 production = new Productionnull_21365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}