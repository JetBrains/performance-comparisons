package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36180 {
    private final Productionnull_36180 production = new Productionnull_36180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}