package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40054 {
    private final Productionnull_40054 production = new Productionnull_40054("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}