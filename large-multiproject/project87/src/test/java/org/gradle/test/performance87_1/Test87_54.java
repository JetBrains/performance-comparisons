package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_54 {
    private final Production87_54 production = new Production87_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}