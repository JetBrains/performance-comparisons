package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_366 {
    private final Production96_366 production = new Production96_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}