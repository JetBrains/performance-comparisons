package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_144 {
    private final Production58_144 production = new Production58_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}