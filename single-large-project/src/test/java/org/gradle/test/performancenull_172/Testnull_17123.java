package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17123 {
    private final Productionnull_17123 production = new Productionnull_17123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}