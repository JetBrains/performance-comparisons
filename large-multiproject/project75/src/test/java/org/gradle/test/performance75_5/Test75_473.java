package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_473 {
    private final Production75_473 production = new Production75_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}