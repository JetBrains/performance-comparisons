package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30862 {
    private final Productionnull_30862 production = new Productionnull_30862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}