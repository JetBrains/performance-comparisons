package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_292 {
    private final Production21_292 production = new Production21_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}