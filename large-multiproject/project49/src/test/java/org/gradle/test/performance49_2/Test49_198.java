package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_198 {
    private final Production49_198 production = new Production49_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}