package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_270 {
    private final Production31_270 production = new Production31_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}