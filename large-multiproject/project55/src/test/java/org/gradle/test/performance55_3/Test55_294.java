package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_294 {
    private final Production55_294 production = new Production55_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}