package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_345 {
    private final Production25_345 production = new Production25_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}