package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_164 {
    private final Production25_164 production = new Production25_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}