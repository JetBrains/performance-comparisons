package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_18 {
    private final Production80_18 production = new Production80_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}