package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21480 {
    private final Productionnull_21480 production = new Productionnull_21480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}