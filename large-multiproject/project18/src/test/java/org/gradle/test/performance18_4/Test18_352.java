package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_352 {
    private final Production18_352 production = new Production18_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}