package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_155 {
    private final Production16_155 production = new Production16_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}