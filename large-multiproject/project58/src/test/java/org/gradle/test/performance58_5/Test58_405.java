package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_405 {
    private final Production58_405 production = new Production58_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}