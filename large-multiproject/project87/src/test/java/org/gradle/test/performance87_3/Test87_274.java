package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_274 {
    private final Production87_274 production = new Production87_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}