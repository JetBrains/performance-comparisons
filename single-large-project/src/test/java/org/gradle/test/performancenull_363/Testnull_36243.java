package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36243 {
    private final Productionnull_36243 production = new Productionnull_36243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}