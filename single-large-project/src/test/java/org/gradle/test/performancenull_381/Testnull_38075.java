package org.gradle.test.performancenull_381;

import static org.junit.Assert.*;

public class Testnull_38075 {
    private final Productionnull_38075 production = new Productionnull_38075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}