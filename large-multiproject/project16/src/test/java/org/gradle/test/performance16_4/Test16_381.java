package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_381 {
    private final Production16_381 production = new Production16_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}