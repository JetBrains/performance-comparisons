package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_484 {
    private final Production58_484 production = new Production58_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}