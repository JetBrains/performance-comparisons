package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_391 {
    private final Production90_391 production = new Production90_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}