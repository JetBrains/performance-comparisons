package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_127 {
    private final Production21_127 production = new Production21_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}