package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_147 {
    private final Production47_147 production = new Production47_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}