package org.gradle.test.performancenull_284;

import static org.junit.Assert.*;

public class Testnull_28398 {
    private final Productionnull_28398 production = new Productionnull_28398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}