package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21664 {
    private final Productionnull_21664 production = new Productionnull_21664("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}