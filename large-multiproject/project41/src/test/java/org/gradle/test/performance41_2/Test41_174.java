package org.gradle.test.performance41_2;

import static org.junit.Assert.*;

public class Test41_174 {
    private final Production41_174 production = new Production41_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}