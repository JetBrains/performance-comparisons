package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_211 {
    private final Production26_211 production = new Production26_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}