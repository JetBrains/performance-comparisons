package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42175 {
    private final Productionnull_42175 production = new Productionnull_42175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}