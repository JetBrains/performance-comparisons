package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_124 {
    private final Production87_124 production = new Production87_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}