package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_111 {
    private final Production80_111 production = new Production80_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}