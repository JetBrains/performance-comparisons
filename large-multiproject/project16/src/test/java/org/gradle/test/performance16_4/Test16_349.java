package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_349 {
    private final Production16_349 production = new Production16_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}