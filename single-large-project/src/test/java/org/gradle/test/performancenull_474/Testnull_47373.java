package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47373 {
    private final Productionnull_47373 production = new Productionnull_47373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}