package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32842 {
    private final Productionnull_32842 production = new Productionnull_32842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}