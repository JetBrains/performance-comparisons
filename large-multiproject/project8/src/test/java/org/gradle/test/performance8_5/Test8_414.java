package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_414 {
    private final Production8_414 production = new Production8_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}