package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30873 {
    private final Productionnull_30873 production = new Productionnull_30873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}