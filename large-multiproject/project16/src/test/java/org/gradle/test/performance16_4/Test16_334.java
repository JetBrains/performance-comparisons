package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_334 {
    private final Production16_334 production = new Production16_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}