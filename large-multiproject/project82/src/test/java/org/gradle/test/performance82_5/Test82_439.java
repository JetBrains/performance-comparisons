package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_439 {
    private final Production82_439 production = new Production82_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}