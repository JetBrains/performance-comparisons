package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41125 {
    private final Productionnull_41125 production = new Productionnull_41125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}