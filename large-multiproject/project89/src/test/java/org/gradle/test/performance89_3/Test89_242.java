package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_242 {
    private final Production89_242 production = new Production89_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}