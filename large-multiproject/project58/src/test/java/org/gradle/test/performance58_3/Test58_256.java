package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_256 {
    private final Production58_256 production = new Production58_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}