package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20120 {
    private final Productionnull_20120 production = new Productionnull_20120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}