package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_192 {
    private final Production21_192 production = new Production21_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}