package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_136 {
    private final Production77_136 production = new Production77_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}