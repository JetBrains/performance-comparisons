package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18241 {
    private final Productionnull_18241 production = new Productionnull_18241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}