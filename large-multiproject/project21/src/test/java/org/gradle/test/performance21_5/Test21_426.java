package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_426 {
    private final Production21_426 production = new Production21_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}