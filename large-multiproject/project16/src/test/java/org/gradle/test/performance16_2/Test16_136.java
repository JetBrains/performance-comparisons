package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_136 {
    private final Production16_136 production = new Production16_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}