package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42138 {
    private final Productionnull_42138 production = new Productionnull_42138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}