package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_375 {
    private final Production12_375 production = new Production12_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}