package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3823 {
    private final Productionnull_3823 production = new Productionnull_3823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}