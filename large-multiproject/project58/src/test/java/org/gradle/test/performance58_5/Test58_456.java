package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_456 {
    private final Production58_456 production = new Production58_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}