package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_340 {
    private final Production16_340 production = new Production16_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}