package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_158 {
    private final Production75_158 production = new Production75_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}