package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_115 {
    private final Production77_115 production = new Production77_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}