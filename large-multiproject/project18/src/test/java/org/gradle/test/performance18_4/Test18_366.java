package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_366 {
    private final Production18_366 production = new Production18_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}