package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_108 {
    private final Production55_108 production = new Production55_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}