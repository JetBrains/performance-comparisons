package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42155 {
    private final Productionnull_42155 production = new Productionnull_42155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}