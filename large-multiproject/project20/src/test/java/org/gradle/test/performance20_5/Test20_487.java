package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_487 {
    private final Production20_487 production = new Production20_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}