package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_429 {
    private final Production71_429 production = new Production71_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}