package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18108 {
    private final Productionnull_18108 production = new Productionnull_18108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}