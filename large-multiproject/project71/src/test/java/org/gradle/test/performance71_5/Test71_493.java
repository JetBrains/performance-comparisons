package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_493 {
    private final Production71_493 production = new Production71_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}