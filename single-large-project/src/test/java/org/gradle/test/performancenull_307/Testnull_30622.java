package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30622 {
    private final Productionnull_30622 production = new Productionnull_30622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}