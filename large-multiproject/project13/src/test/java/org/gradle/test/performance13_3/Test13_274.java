package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_274 {
    private final Production13_274 production = new Production13_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}