package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18688 {
    private final Productionnull_18688 production = new Productionnull_18688("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}