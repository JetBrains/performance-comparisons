package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_69 {
    private final Production83_69 production = new Production83_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}