package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_410 {
    private final Production43_410 production = new Production43_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}