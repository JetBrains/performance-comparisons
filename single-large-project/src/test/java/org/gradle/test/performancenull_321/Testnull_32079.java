package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32079 {
    private final Productionnull_32079 production = new Productionnull_32079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}