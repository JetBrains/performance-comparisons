package org.gradle.test.performancenull_162;

import static org.junit.Assert.*;

public class Testnull_16173 {
    private final Productionnull_16173 production = new Productionnull_16173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}