package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_121 {
    private final Production71_121 production = new Production71_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}