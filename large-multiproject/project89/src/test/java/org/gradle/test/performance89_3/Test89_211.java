package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_211 {
    private final Production89_211 production = new Production89_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}