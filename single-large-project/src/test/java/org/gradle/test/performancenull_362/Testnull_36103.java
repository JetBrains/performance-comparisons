package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36103 {
    private final Productionnull_36103 production = new Productionnull_36103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}