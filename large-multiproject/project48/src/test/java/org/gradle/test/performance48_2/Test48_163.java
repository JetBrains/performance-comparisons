package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_163 {
    private final Production48_163 production = new Production48_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}