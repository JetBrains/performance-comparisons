package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40295 {
    private final Productionnull_40295 production = new Productionnull_40295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}