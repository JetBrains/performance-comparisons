package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_1 {
    private final Production61_1 production = new Production61_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}