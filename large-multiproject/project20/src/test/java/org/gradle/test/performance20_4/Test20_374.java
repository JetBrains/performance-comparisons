package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_374 {
    private final Production20_374 production = new Production20_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}