package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_366 {
    private final Production33_366 production = new Production33_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}