package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_390 {
    private final Production13_390 production = new Production13_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}