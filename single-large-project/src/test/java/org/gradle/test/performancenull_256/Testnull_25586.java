package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25586 {
    private final Productionnull_25586 production = new Productionnull_25586("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}