package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_444 {
    private final Production13_444 production = new Production13_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}