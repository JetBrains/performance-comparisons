package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24931 {
    private final Productionnull_24931 production = new Productionnull_24931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}