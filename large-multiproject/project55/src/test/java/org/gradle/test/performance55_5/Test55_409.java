package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_409 {
    private final Production55_409 production = new Production55_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}