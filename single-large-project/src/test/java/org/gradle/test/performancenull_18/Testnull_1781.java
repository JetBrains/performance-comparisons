package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1781 {
    private final Productionnull_1781 production = new Productionnull_1781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}