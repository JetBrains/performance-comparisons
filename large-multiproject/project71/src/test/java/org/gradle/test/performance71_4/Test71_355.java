package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_355 {
    private final Production71_355 production = new Production71_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}