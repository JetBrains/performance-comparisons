package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_203 {
    private final Production92_203 production = new Production92_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}