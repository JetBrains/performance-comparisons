package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5285 {
    private final Productionnull_5285 production = new Productionnull_5285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}