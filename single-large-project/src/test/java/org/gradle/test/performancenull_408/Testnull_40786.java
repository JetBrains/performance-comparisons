package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40786 {
    private final Productionnull_40786 production = new Productionnull_40786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}