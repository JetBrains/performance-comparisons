package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_350 {
    private final Production89_350 production = new Production89_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}