package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_489 {
    private final Production39_489 production = new Production39_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}