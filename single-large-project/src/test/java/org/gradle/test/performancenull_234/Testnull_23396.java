package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23396 {
    private final Productionnull_23396 production = new Productionnull_23396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}