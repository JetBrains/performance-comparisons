package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43980 {
    private final Productionnull_43980 production = new Productionnull_43980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}