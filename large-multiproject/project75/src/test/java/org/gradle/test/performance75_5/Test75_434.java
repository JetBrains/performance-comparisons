package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_434 {
    private final Production75_434 production = new Production75_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}