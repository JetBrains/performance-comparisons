package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_434 {
    private final Production90_434 production = new Production90_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}