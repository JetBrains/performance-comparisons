package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_224 {
    private final Production80_224 production = new Production80_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}