package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_158 {
    private final Production55_158 production = new Production55_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}