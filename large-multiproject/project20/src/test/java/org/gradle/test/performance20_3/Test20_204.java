package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_204 {
    private final Production20_204 production = new Production20_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}