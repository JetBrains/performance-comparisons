package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_489 {
    private final Production92_489 production = new Production92_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}