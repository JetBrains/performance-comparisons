package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_139 {
    private final Production87_139 production = new Production87_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}