package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_245 {
    private final Production39_245 production = new Production39_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}