package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35933 {
    private final Productionnull_35933 production = new Productionnull_35933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}