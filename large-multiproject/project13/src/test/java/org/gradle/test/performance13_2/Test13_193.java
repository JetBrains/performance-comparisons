package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_193 {
    private final Production13_193 production = new Production13_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}