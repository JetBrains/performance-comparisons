package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21492 {
    private final Productionnull_21492 production = new Productionnull_21492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}