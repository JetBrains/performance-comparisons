package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_215 {
    private final Production88_215 production = new Production88_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}