package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_232 {
    private final Production43_232 production = new Production43_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}