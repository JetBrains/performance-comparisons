package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40261 {
    private final Productionnull_40261 production = new Productionnull_40261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}