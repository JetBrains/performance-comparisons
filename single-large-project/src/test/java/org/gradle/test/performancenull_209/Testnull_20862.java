package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20862 {
    private final Productionnull_20862 production = new Productionnull_20862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}