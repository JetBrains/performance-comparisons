package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_311 {
    private final Production75_311 production = new Production75_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}