package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11913 {
    private final Productionnull_11913 production = new Productionnull_11913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}