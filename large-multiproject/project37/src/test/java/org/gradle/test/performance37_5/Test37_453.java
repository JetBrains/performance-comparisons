package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_453 {
    private final Production37_453 production = new Production37_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}