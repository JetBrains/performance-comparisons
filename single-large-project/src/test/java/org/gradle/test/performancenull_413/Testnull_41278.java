package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41278 {
    private final Productionnull_41278 production = new Productionnull_41278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}