package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1780 {
    private final Productionnull_1780 production = new Productionnull_1780("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}