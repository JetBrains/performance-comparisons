package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_277 {
    private final Production99_277 production = new Production99_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}