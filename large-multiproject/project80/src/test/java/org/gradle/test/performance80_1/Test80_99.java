package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_99 {
    private final Production80_99 production = new Production80_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}