package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_254 {
    private final Production84_254 production = new Production84_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}