package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_318 {
    private final Production61_318 production = new Production61_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}