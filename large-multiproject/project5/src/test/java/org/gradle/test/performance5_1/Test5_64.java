package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_64 {
    private final Production5_64 production = new Production5_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}