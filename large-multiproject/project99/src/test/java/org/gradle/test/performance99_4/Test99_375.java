package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_375 {
    private final Production99_375 production = new Production99_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}