package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_377 {
    private final Production21_377 production = new Production21_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}