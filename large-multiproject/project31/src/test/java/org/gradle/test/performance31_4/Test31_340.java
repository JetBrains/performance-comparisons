package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_340 {
    private final Production31_340 production = new Production31_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}