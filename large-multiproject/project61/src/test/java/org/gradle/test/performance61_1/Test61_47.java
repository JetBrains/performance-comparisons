package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_47 {
    private final Production61_47 production = new Production61_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}