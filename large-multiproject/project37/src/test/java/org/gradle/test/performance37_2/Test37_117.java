package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_117 {
    private final Production37_117 production = new Production37_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}