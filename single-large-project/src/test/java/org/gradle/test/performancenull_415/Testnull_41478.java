package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41478 {
    private final Productionnull_41478 production = new Productionnull_41478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}