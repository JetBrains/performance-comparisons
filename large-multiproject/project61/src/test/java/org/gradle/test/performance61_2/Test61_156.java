package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_156 {
    private final Production61_156 production = new Production61_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}