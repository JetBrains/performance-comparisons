package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28122 {
    private final Productionnull_28122 production = new Productionnull_28122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}