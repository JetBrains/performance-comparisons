package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33954 {
    private final Productionnull_33954 production = new Productionnull_33954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}