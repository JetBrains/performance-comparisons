package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_107 {
    private final Production48_107 production = new Production48_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}