package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_471 {
    private final Production63_471 production = new Production63_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}