package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_410 {
    private final Production10_410 production = new Production10_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}