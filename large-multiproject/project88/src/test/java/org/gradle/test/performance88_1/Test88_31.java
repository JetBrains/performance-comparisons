package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_31 {
    private final Production88_31 production = new Production88_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}