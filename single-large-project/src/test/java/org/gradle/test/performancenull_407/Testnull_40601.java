package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40601 {
    private final Productionnull_40601 production = new Productionnull_40601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}