package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_229 {
    private final Production82_229 production = new Production82_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}