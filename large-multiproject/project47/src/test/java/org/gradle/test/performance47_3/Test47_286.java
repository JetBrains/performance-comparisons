package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_286 {
    private final Production47_286 production = new Production47_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}