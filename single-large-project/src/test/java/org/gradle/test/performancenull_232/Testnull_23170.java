package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23170 {
    private final Productionnull_23170 production = new Productionnull_23170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}