package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_431 {
    private final Production89_431 production = new Production89_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}