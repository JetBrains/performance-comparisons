package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_412 {
    private final Production92_412 production = new Production92_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}