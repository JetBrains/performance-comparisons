package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_459 {
    private final Production61_459 production = new Production61_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}