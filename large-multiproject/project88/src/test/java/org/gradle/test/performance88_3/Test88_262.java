package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_262 {
    private final Production88_262 production = new Production88_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}