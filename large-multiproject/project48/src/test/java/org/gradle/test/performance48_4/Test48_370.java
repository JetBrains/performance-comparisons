package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_370 {
    private final Production48_370 production = new Production48_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}