package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_257 {
    private final Production55_257 production = new Production55_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}