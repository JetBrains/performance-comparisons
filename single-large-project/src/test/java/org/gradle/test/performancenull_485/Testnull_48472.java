package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48472 {
    private final Productionnull_48472 production = new Productionnull_48472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}