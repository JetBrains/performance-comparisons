package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41244 {
    private final Productionnull_41244 production = new Productionnull_41244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}