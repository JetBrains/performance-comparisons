package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_79 {
    private final Production92_79 production = new Production92_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}