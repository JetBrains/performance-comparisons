package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_451 {
    private final Production90_451 production = new Production90_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}