package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_158 {
    private final Production16_158 production = new Production16_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}