package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_226 {
    private final Production10_226 production = new Production10_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}