package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27415 {
    private final Productionnull_27415 production = new Productionnull_27415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}