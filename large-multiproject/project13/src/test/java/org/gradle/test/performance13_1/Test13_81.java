package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_81 {
    private final Production13_81 production = new Production13_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}