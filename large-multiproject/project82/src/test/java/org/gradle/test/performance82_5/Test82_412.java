package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_412 {
    private final Production82_412 production = new Production82_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}