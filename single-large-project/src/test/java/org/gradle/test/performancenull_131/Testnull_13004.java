package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13004 {
    private final Productionnull_13004 production = new Productionnull_13004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}