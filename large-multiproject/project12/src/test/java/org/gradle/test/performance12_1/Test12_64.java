package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_64 {
    private final Production12_64 production = new Production12_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}