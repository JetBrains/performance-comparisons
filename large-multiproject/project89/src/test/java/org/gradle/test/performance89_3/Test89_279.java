package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_279 {
    private final Production89_279 production = new Production89_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}