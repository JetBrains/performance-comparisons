package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_45 {
    private final Production55_45 production = new Production55_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}