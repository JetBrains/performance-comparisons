package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_101 {
    private final Production25_101 production = new Production25_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}